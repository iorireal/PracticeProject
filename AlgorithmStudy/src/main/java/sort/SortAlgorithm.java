package sort;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by LUHAO on 2017/6/19.
 */
public class SortAlgorithm {
    static final Object[] ints = {49,38,65,97,76,13,27,49,78,34,12,64,1,8};
    static QuickSort quickSort = new QuickSort();
    static MergeSort mergeSort = new MergeSort();

    public static void main(String[] args) {
//        quickSortResult();
        mergeSortResult();
    }

    private static void quickSortResult() {
        long start = System.currentTimeMillis();
        int[] quickSortList =  quickSort.quickSort(ints);
        System.out.println("QuickSort result:" +
                JSONObject.toJSONString(quickSortList));
        Long quickEnd = System.currentTimeMillis() - start;
        System.out.println("quickSort cost = [" + quickEnd + "ms]");
    }

    private static void mergeSortResult() {
        long start = System.currentTimeMillis();
        int[] mergeSortList =  mergeSort.mergeSort(ints);
        System.out.println("MergeSort result:" +
                JSONObject.toJSONString(mergeSortList));
        Long quickEnd = System.currentTimeMillis() - start;
        System.out.println("MergeSort cost = [" + quickEnd + "ms]");
    }

}
