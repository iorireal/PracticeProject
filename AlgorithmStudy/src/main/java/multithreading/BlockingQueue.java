package multithreading;

import java.util.LinkedList;
import java.util.List;

/**
 * 阻塞队列的简单实现
 * Created by Administrator on 2017/5/23.
 */
public class BlockingQueue {
    private List<Object> queue = new LinkedList<Object>();
    private int limit = 10;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enQueue(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized void deQueue() throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }
        this.queue.remove(0);
    }
}
