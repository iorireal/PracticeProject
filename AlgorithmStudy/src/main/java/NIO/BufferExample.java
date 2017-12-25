package NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/22.
 */
public class BufferExample {

    private Selector getSelector() throws IOException {
        return Selector.open();
    }

    public void bufferAccess(String name) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile(name,"rw");
        FileChannel inChannel = aFile.getChannel();// fileChannel之间可以互相传递数据

        RandomAccessFile bFile = new RandomAccessFile(name,"rw");
        FileChannel toChannel = bFile.getChannel();
        long position = 0;
        long count = inChannel.size();
        toChannel.transferFrom(inChannel, position, count);// inChannel ==> toChannel
        inChannel.transferTo(position, count, toChannel);// inChannel ==> toChannel
        //在SoketChannel的实现中，SocketChannel只会传输此刻准备好的数据（可能不足count字节）。因此，SocketChannel可能不会将请求的所有数据(count个字节)全部传输到FileChannel中

        // 注册Selector
        Selector selector = Selector.open();
        SocketAddress socketAddress = new SocketAddress() {
        };
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.socket().bind(new InetSocketAddress(9999));
        channel.configureBlocking(false);
        SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
        // interest集合 key.interestOps()  ready集合 key.readyOps()  key.isAcceptable()...

        // 访问就绪的通道
        acessReadyChannel(selector);

        // create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);
        // scattering/gathering
        ByteBuffer head = ByteBuffer.allocate(128);
        ByteBuffer body = ByteBuffer.allocate(128);
        ByteBuffer[] bufferArray = {head, body};
        inChannel.read(bufferArray);// scattering 不适用与动态消息
        inChannel.write(bufferArray);// gathering

        int bytesRead = inChannel.read(buf); // write into buffer
        while (bytesRead != -1) {
            buf.flip(); // make buffer ready for read (change mode to read)
            while (buf.hasRemaining()) {
                System.out.println((char) buf.get()); // read 1 byte at a time
            }
            buf.clear(); // make buffer ready for writing (change mode to write)
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }

    public  void simpleExample () throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.configureBlocking(false);
        SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
        while(true) {
            int readyChannels = selector.select();
            if(readyChannels == 0) continue;
            acessReadyChannel(selector);
        }
    }

    private void acessReadyChannel(Selector selector) {
        Set selectedKeys = selector.selectedKeys();
        Iterator keyIterator = selectedKeys.iterator();
        while(keyIterator.hasNext()) {
            SelectionKey skey = (SelectionKey) keyIterator.next();
            if(skey.isAcceptable()) {
                // a connection was accepted by a ServerSocketChannel.
            } else if (skey.isConnectable()) {
                // a connection was established with a remote server.
            } else if (skey.isReadable()) {
                // a channel is ready for reading
            } else if (skey.isWritable()) {
                // a channel is ready for writing
            }
            keyIterator.remove();
        }
    }
}
