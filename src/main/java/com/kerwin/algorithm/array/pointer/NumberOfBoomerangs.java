package com.kerwin.algorithm.array.pointer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 回旋镖的数量
 *  给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。
 *  回旋镖 是由点 (i, j, k) 表示的元组 ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 *  返回平面上所有回旋镖的数量。
 * @link https://leetcode-cn.com/problems/number-of-boomerangs
 * @Author KerVinLi
 * @Version 1.0
 */
public class NumberOfBoomerangs {
    /**
     * 枚举 + 哈希表
     * 题目所描述的回旋镖可以视作一个 V 型的折线。
     * 我们可以枚举每个 points[i]，将其当作 V 型的拐点。
     * 设 points 中有 m 个点到 points[i] 的距离均相等，
     * 我们需要从这 m 点中选出 2 个点当作回旋镖的 2个端点，
     * 由于题目要求考虑元组的顺序，因此方案数即为在 m 个元素中选出 2 个不同元素的排列数，
     * 即：
     * A_m^2 =m⋅(m−1)
     * 据此，我们可以遍历 points，计算并统计所有点到 points[i] 的距离，将每个距离的出现次数记录在哈希表中，然后遍历哈希表，并用上述公式计算并累加回旋镖的个数。
     * 在代码实现时，我们可以直接保存距离的平方，避免复杂的开方运算。
     *
     * 时间复杂度：O(n^2)其中 n 是数组 points 的长度。
     * 空间复杂度：O(n)
     * @param points
     * @return
     */
    public static int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p : points) {
            Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
            for (int[] q : points) {
                int dis = (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
                cnt.put(dis, cnt.getOrDefault(dis, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
                int m = entry.getValue();
                ans += m * (m - 1);
            }
        }
        return ans;
    }
}
