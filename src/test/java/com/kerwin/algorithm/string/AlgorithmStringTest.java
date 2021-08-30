package com.kerwin.algorithm.string;

import com.kerwin.algorithm.string.match.ValidParentheses;
import org.junit.jupiter.api.Test;

/**
 * @Description: 字符串相关测试用例
 * @Author KerVinLi
 * @Version 1.0
 */
public class AlgorithmStringTest {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效
     */
    @Test
    void testValidParentheses(){
        System.out.println(ValidParentheses.isValid("({[{}]})"));   //true
        System.out.println(ValidParentheses.isValid("({}{}[]{})")); //true
        System.out.println(ValidParentheses.isValid("({[{}(}]})")); //false
    }
}
