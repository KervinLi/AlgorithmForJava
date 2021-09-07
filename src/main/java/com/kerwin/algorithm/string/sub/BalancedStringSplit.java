package com.kerwin.algorithm.string.sub;

/**
 * @Description: 分割平衡字符串
 * 根据题意，对于一个平衡字符串 s，若 s 能从中间某处分割成左右两个子串，若其中一个是平衡字符串，
 * 则另一个的 L 和 R 字符的数量必然是相同的，所以也一定是平衡字符串。
 *
 * 为了最大化分割数量，我们可以不断循环，每次从 s 中分割出一个最短的平衡前缀，由于剩余部分也是平衡字符串，
 * 我们可以将其当作 s 继续分割，直至 s 为空时，结束循环。
 *
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL"、"RRLL"、"RL"、"RL" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
 *
 *输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL"、"LLLRRR"、"LR" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
 *
 * 输入：s = "RLRRRLLRLL"
 * 输出：2
 * 解释：s 可以分割为 "RL"、"RRRLLRLL" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
 *
 * @link https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * @Author KerVinLi
 * @Version 1.0
 */
public class BalancedStringSplit {
    /**
     *
     * @param s
     * @return
     */
    public static int balancedStringSplit(String s) {
        int ans = 0, d = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                ++d;
            } else {
                --d;
            }
            if (d == 0) {
                ++ans;
            }
        }
        return ans;
    }

}
