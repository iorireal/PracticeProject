package string;


import com.alibaba.fastjson.JSONObject;

/**
 * 字符串匹配KMP算法
 * http://blog.csdn.net/yutianzuijin/article/details/11954939/
 * Created by Administrator on 2017/4/26.
 */
public class KMP {
    public static void main(String[] args) {
        String original = "abcdefgabcdefg";
        String target = "bcdbcd";
        KMPsearch(original, target);
        System.out.println(simpleMatch(original, target));
    }

    public static int[] getNextArray(String str) {
        int length = str.length();
        int j = 0;
        int[] next = new int[length + 1];//next表示长度为i的字符串前缀和后缀的最长公共部分，从1开始
        next[0] = next[1] = 0;
        for (int i = 1; i < length; i++) {//i表示字符串的下标，从0开始
            while (j > 0 && str.charAt(j) != str.charAt(i))
                j = next[j];//j在每次循环开始都表示next[i]的值，同时也表示需要比较的下一个位置
            if (str.charAt(i) == str.charAt(j))
                j++;
            next[i + 1] = j;
        }
        return next;
    }

    public static void KMPsearch(String original, String target) {
        int[] next = getNextArray(target);
        System.out.println(JSONObject.toJSON(next));
        int j = 0;
        for (int i = 0; i < original.length(); i++) {
            while (j > 0 && original.charAt(i) != target.charAt(j))
                j = next[j];
            if (original.charAt(i) == target.charAt(j))
                j++;
            if (j == target.length()) {
                System.out.println("find a position at:" + (i - j + 1));
                System.out.println(original.subSequence(i - j + 1, i + 1));
                j = next[j];
            }
        }
    }

    public static int simpleMatch(String haystack, String needle) {
        if (haystack == null && needle == null) return 0;
        if (haystack == null) return -1;
        if (needle == null) return 0;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            for (; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }
}
