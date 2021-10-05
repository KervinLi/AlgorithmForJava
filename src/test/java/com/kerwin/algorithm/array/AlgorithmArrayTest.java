package com.kerwin.algorithm.array;

import com.kerwin.algorithm.array.iterator.PeekingIterator;
import com.kerwin.algorithm.array.pointer.ContainerWithMostWater;
import com.kerwin.algorithm.array.pointer.FindPeakElement;
import com.kerwin.algorithm.array.pointer.NumberOfBoomerangs;
import com.kerwin.algorithm.array.pointer.TwoSum;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * 回旋镖的数量
     */
    @Test
    void testNumberOfBoomerangs(){
        int [][] points = {{0,0},{1,0},{2,0}};
        log.info("回旋镖的数量:{}", NumberOfBoomerangs.numberOfBoomerangs(points));
    }

    /**
     * 寻找峰值
     */
    @Test
    void testFindPeakElement(){
        int[] nums = {1,2,1,3,5,6,4};
        log.info("峰值为：{}", FindPeakElement.findPeakElement(nums));
    }

    /**
     * 顶端迭代器测试用例
     */
    @Test
    void testPeekingIterator(){
        List<Integer> list = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(4);
            add(3);
            add(5);
        }};
        PeekingIterator peekingIterator = new PeekingIterator<Integer>(list.iterator());
        System.out.println(peekingIterator.next());     // 返回 1 ，指针移动到下一个元素 [1,(2),4,3,5]
        System.out.println(peekingIterator.peek());     // 返回 2 ，指针未发生移动 [1,(2),4,3,5]
        System.out.println(peekingIterator.next());     // 返回 2 ，指针移动到下一个元素 [1,2,(4),3,5]
        System.out.println(peekingIterator.next());     // 返回 4 ，指针移动到下一个元素 [1,2,4,(3),5]
        System.out.println(peekingIterator.hasNext());  // 返回 true
        System.out.println(peekingIterator.next());     // 返回 3 ，指针移动到下一个元素 [1,2,4,3,(5)]
        System.out.println(peekingIterator.hasNext());  // 返回 true
        System.out.println(peekingIterator.next());     // 返回 5 ，指针移动到下一个元素 [1,2,4,3,5]
        System.out.println(peekingIterator.hasNext());  // 返回 false

    }
}
