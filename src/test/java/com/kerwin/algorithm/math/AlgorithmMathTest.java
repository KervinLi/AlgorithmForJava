package com.kerwin.algorithm.math;

import com.kerwin.algorithm.math.change.IntegerToRoman;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: 数学类相关测试
 * @Author KerVinLi
 * @Version 1.0
 */
@Slf4j
public class AlgorithmMathTest {
    /**
     * 整数转罗马数字
     */
    @Test
    void testIntegerToRoman(){
        log.info("整数({})转罗马数字:{}",58, IntegerToRoman.intToRoman(58));
        log.info("整数({})转罗马数字:{}",1994, IntegerToRoman.intToRoman(1994));
    }
}
