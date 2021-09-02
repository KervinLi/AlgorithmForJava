package com.kerwin.algorithm.array;

import com.kerwin.algorithm.array.pointer.ContainerWithMostWater;
import com.kerwin.algorithm.array.pointer.TwoSum;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: 数组相关测试
 * @Author KerVinLi
 * @Version 1.0
 */
@Slf4j
public class AlgorithmArrayTest {
    /**
     * 盛最多水的容器
     */
    @Test
    void testContainerWithMostWater(){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        log.info("盛最多水:{}", ContainerWithMostWater.maxArea(arr));
    }

    /**
     * 两数之和
     */
    @Test
    void testTwoSum(){
        int[] nums = {2,7,11,15};
        int target = 9;
        log.info("两数之和：{}", TwoSum.twoSum(nums,target));
    }
}
