package com.kerwin.algorithm.math.random;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: Rand7生成Rand10
 * @Author KerVinLi
 * @Version 1.0
 */
@Slf4j
public class RandSevenToRandTen {
    //统计计数
    static AtomicInteger count = new AtomicInteger(1);
    /**
     * 古典概型:两次rand7分别构造1/2和1/5的概率即可，
     * 调用两次rand7 达到要求生成[1 10]的概率为：6/7 * 5/7 = 30/49
     * @return
     */
    public static int randSevenToRandTen(){
        int first = rand7();
        int second = rand7();
        //随机[1 6] 构造一个1/2概率
        while (first > 6){ first = rand7(); }
        //随机[1 5] 构造一个1/5概率
        while (second > 5){ second = rand7(); }
       return (first & 1) == 1?second:5+second;
    }
    /**
     * 构造一个[1 7]的随机生成器
     * @return
     */
    private static int rand7(){
        log.info("第{}次调用。。。", count.getAndIncrement());
        Random random = new Random();
        return random.nextInt(7)+1;
    }
}
