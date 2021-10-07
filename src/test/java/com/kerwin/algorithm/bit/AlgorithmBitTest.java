package com.kerwin.algorithm.bit;

import com.kerwin.algorithm.bit.operate.SingleNumber;
import org.junit.jupiter.api.Test;

/**
 * @Description: 位操作相关测试用例
 * @Author KerVinLi
 * @Version 1.0
 */
public class AlgorithmBitTest {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现【两次】。找出那个只出现了一次的元素。
     */
    @Test
    void testSingleNumberTwo(){
        int [] nums = {1,4,6,4,1,8,6};
        System.out.println(SingleNumber.singleNumberTwo(nums));
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现【三次】。找出那个只出现了一次的元素。
     */
    @Test
    void testSingleNumberThree(){
        int [] nums = {1,4,1,4,1,2,4};
        System.out.println(SingleNumber.singleNumberThree(nums));
    }
}
