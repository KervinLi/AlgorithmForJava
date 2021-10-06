package com.kerwin.algorithm.bit.operate;

/**
 * @Description: 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @link:https://leetcode-cn.com/problems/single-number
 * @Author KerVinLi
 * @Version 1.0
 */
public class SingleNumber {
    /**
     * 时间复杂度：O(n)，其中 n 是数组长度。只需要对数组遍历一次。
     *
     * 空间复杂度：O(1)。
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums){
        int res = 0;
        for(int num:nums){
           res ^= num ;
        }
        return res;
    }
}
