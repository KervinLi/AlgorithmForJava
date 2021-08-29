package com.kerwin.algorithm.string.sub;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description :给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 示例 4:
 * 输入: s = ""
 * 输出: 0
 *
 * 提示：
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * @link https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * @Author KerVinLi
 * @Date 2021-08-29
 */
@Slf4j
public class MaxSubLength {
    /**
     * [滑动窗口]字符串最长字串长度
     * @param s
     * @return maxSubLength
     */
    public static int lengthOfLongestSubString(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for(int right =0 ,len = s.length();right<len;right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    /**
     * 测试类
     * @param args
     */
    public static void main(String[] args) {
        String[] arr = {"abcabcbb","bbbbb","pwwkew",""};
        for(int i = 0;i<arr.length;i++){
            log.info("{}最长子串长度{}",arr[i],lengthOfLongestSubString(arr[i]));
        }
    }

}
