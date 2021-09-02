package com.kerwin.algorithm.array;

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
        log.info("盛最多水:{}",ContainerWithMostWater.maxArea(arr));
    }
}
