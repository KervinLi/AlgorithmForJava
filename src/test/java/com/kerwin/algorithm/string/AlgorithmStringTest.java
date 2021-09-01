package com.kerwin.algorithm.string;

import com.kerwin.algorithm.string.compare.CompareVersion;
import com.kerwin.algorithm.string.match.ValidParentheses;
import com.kerwin.algorithm.string.sub.LongestCommonPrefix;
import com.kerwin.algorithm.string.sub.MaxSubLength;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Description: 字符串相关测试用例
 * @Author KerVinLi
 * @Version 1.0
 */
@Slf4j
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

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
     */
    @Test
    void testLengthOfLongestSubString(){
        String[] arr = {"abcabcbb","bbbbb","pwwkew",""};
        for(int i = 0;i<arr.length;i++){
            log.info("{}最长子串长度{}",arr[i], MaxSubLength.lengthOfLongestSubString(arr[i]));
        }
    }

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀
     */
    @Test
    void testLongestCommonPrefix(){
        String[] arr = {"flower","flow","flight"};
        log.info("横向扫描结果；{}",LongestCommonPrefix.rowLongestCommonPrefix(arr));
        log.info("纵向扫描结果；{}",LongestCommonPrefix.colLongestCommonPrefix(arr));
    }

    /**
     * 比较版本号
     */
    @Test
    void testCompareVersion(){
        String v1 = "7.5.2.4";
        String v2 = "7.5.3";
        log.info("版本号1:{},版本号2:{},比较结果：{}",v1,v2, CompareVersion.splitCompareVersion(v1,v2));
    }
}
