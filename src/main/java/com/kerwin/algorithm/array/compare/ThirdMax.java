package com.kerwin.algorithm.array.compare;

/**
 * @Description: 第三大的数
 *
 * @Author KerVinLi
 * @Version 1.0
 */
public class ThirdMax {
    /**
     * 时间复杂度：O(n)，其中 n 是数组 nums 的长度。
     * 空间复杂度：O(1)。
     * @param nums
     * @return
     */
    public static int thirdMax(int[] nums) {
        Integer a = null, b = null, c = null;
        for (int num : nums) {
            if (a == null || num > a) {
                c = b;
                b = a;
                a = num;
            } else if (num < a && (b == null || num > b)) {
                c = b;
                b = num;
            } else if (num < b && (c == null || num > c)) {
                c = num;
            }
        }
        return c == null ? a : c;
    }
}
