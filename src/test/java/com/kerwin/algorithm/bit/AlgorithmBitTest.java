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
     * 只出现一次的数字
     */
    @Test
    void testSingleNumber(){
        int [] nums = {1,4,6,4,1,8,6};
        System.out.println(SingleNumber.singleNumber(nums));
    }
}
