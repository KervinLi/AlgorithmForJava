package com.kerwin.algorithm.math;

import com.kerwin.algorithm.math.arithmetic.IpLongUtils;
import com.kerwin.algorithm.math.arithmetic.Pow;
import com.kerwin.algorithm.math.change.IntegerToRoman;
import com.kerwin.algorithm.math.change.RomanToInteger;
import com.kerwin.algorithm.math.random.BusinessSerialNumberGenerator;
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

    /**
     * 随机生成含有特殊含义的业务流水号
     */
    @Test
    void testBusinessSerialNumberGenerator(){
        for(int i=0 ;i<100;i++){
           log.info("业务流水号：{}", BusinessSerialNumberGenerator.produceBusinessSerialNumber());
        }
    }

    /**
     * IPv4与Long相互转换工具
     */
    @Test
    void testIpLongUtils(){
        log.info("IP({})转Long:{}", "192.168.0.1",IpLongUtils.ip2Long("192.168.0.1"));
        log.info("Long({})转IP:{}", 3232235521L,IpLongUtils.long2Ip(3232235521L));
        log.info("IP({})转Long:{}", "127.0.0.1",IpLongUtils.ip2Long("127.0.0.1"));
        log.info("Long({})转IP:{}", 2130706433L,IpLongUtils.long2Ip(2130706433L));

    }

    /**
     * 自定义pow测试
     */
    @Test
    void testPow(){
        log.info("pow(2,2)={}", Pow.selfPow(2,2));
        log.info("pow(2,-2)={}", Pow.selfPow(2,-2));
        log.info("pow(2,0)={}", Pow.selfPow(2,0));
        log.info("pow(2,8)={}", Pow.selfPow(2,8));
    }
}
