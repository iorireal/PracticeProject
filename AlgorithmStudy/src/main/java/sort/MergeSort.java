package sort;

import java.util.Arrays;

/**
 * 归并排序
 * Created by LUHAO on 2017/6/19.
 */
public class MergeSort {
    public int[] mergeSort (Object[] objects) {
        if (objects == null) {
            return null;
        }
        int[] ints = new int[objects.length];
        int i = 0;
        for (Object object : objects) {
            if (object != null && object instanceof  Integer) {
                ints[i++] = Integer.parseInt(object.toString());
            }
        }
        mergeSort(ints);
        return Arrays.asList(ints).get(0);
    }

    private void mergeSort(int[] ints) {
        mergeSort(ints, 0, ints.length-1);
    }



    public void mergeSort(int[] ints, int left, int right) {
        if (left < right) {
            int middle = (left + right)/2;
            //对左边进行递归
            mergeSort(ints, left, middle);
            //对右边进行递归
            mergeSort(ints, middle+1, right);
            //合并
            merge(ints, left, middle, right);
        }
    }

    public void merge(int[] ints, int left, int middle, int right) {
        int[] tempArr = new int[ints.length];
        int mid = middle+1; //右边的起始位置
        int temp = left;
        int third = left;
        while (left <= middle && mid <= right) {
            //将较小的数放入中间数组tempArr
            if (ints[left] <= ints[mid]) {
                tempArr[third++] = ints[left++];
            } else {
                tempArr[third++] = ints[mid++];
            }
        }
        //将剩余的部分加入中间数组tempArr
        while (left <= middle) { //左边剩余
            tempArr[third++] = ints[left++];
        }
        while (mid <= right) {
            tempArr[third++] = ints[mid++];
        }
        //将中间数组复制到原数组中
        while (temp <= right) {
            ints[temp] = tempArr[temp++];
        }
    }
}
