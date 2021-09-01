package com.kerwin.algorithm.string.match;

import java.util.*;

/**
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效
 * 判断括号的有效性可以使用「栈」这一数据结构来解决,左括号入栈，右括号出栈
 * @link https://leetcode-cn.com/problems/valid-parentheses/solution/you-xiao-de-gua-hao-by-leetcode-solution/
 * @Author KerVinLi
 * @Version 1.0
 */
public class ValidParentheses {
    /**
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        int n = s.length();
        //注意到有效字符串的长度一定为偶数，因此如果字符串的长度为奇数，我们可以直接返回False，省去后续的遍历判断过程
        if ((n & 1) == 1) { return false; }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                //弹出栈顶
                stack.pop();
            } else {
                //值入栈顶
                stack.push(ch);
            }
        }
        //判断最后栈是否为空即可
        return stack.isEmpty();
    }
}
