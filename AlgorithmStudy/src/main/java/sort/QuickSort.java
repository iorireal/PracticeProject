package sort;

import java.util.Arrays;
import java.util.List;

/**
 * 快速排序
 * Created by LUHAO on 2017/6/19.
 */
public class QuickSort {
    public int[] quickSort (List<Object> list) {
        return quickSort(list.toArray());
    }

    public int[] quickSort (Object[] objects) {
        if (objects == null){
            return null;
        }
        int[] ints = new int[objects.length];
        int i = 0;
        for (Object obj:objects) {
            if(obj !=null && obj instanceof Integer){
                ints[i++] = Integer.parseInt(obj.toString());
            }
        }
        quickSort(ints);
        return Arrays.asList(ints).get(0);
    }

    public void quickSort(int[] ints) {
        quickSort(ints, 0 , ints.length-1);
    }

    private void quickSort(int[] ints, int low, int high) {
        if (low < high) {
            int middle = getMiddle(ints, low , high);
            quickSort(ints, middle+1, high);
            quickSort(ints, 0, middle-1);
        }
    }

    private int getMiddle(int[] ints, int low, int high) {
        int temp = ints[low]; // 基准元素
        while (low < high) {
            while (low < high && ints[high] >= temp ) { // 找到比基准元素小的元素位置
                high--;
            }
            ints[low] = ints[high];
            while (low < high && ints[low] <= temp) { // 找到比基准元素大的元素位置
                low++;
            }
            ints[high] = ints[low];
        }
        ints[low] = temp;
        return low;
    }

}
