package com.kerwin.algorithm.bit.operate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description: 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @link:https://leetcode-cn.com/problems/single-number
 * @Author KerVinLi
 * @Version 1.0
 */
public class SingleNumber {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现【两次】。找出那个只出现了一次的元素。
     * 时间复杂度：O(n)，其中 n 是数组长度。只需要对数组遍历一次。
     * 空间复杂度：O(1)。
     * @param nums
     * @return
     */
    public static int singleNumberTwo(int[] nums){
        int res = 0;
        for(int num:nums){
           res ^= num ;
        }
        return res;
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现【三次】。找出那个只出现了一次的元素。
     * @param nums
     * @return
     */
    public static Integer singleNumberThree(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            Integer count = map.getOrDefault(num, 0);
            if(count == 2){
                map.remove(num);
            }else{
                map.put(num,++count);
            }
        }
        Integer res = null;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if(next.getValue().intValue() == 1){
                res = next.getKey();
            }
        }
        return res;
    }
}
