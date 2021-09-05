package com.kerwin.algorithm.math;

import com.kerwin.algorithm.math.change.IntegerToRoman;
import com.kerwin.algorithm.math.change.RomanToInteger;
import com.kerwin.algorithm.math.random.RandSevenToRandTen;
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
        log.info("整数({})转罗马数字:{}",58, IntegerToRoman.intToRoman(58));//LVIII
        log.info("整数({})转罗马数字:{}",1994, IntegerToRoman.intToRoman(1994));//MCMXCIV
    }

    /**
     * 罗马数字转整数
     */
    @Test
    void testRomanToInteger(){
        log.info("罗马数字({})转整数:{}","LVIII", RomanToInteger.romanToInt("LVIII"));//58
        log.info("罗马数字({})转整数:{}","MCMXCIV", RomanToInteger.romanToInt("MCMXCIV"));//1994
        log.info("罗马数字({})转整数:{}","IV", RomanToInteger.romanToInt("IV"));//4
        log.info("罗马数字({})转整数:{}","VI", RomanToInteger.romanToInt("VI"));//6
    }

    /**
     * Rand7生成Rand10
     */
    @Test
    void testRandSevenToRandTen(){
        log.info("通过Rand7生产Rand10:{}", RandSevenToRandTen.randSevenToRandTen());
    }
}
