package com.kerwin.algorithm.math.arithmetic;

/**
 * @Description: 实现类似于Math.pow()
 * @Author KerVinLi
 * @Version 1.0
 */
public class Pow {

    /**
     * pow(double x,int n)
     * @param x
     * @param n
     * @return
     */
    public static double selfPow(double x,int n){
        return n>=0?quickMul(x,n):1.0/quickMul(x,-n);
    }

    /**
     * 快速幂 + 迭代
     * @param x
     * @param N
     * @return
     */
    private static double quickMul(double x, int N){
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (N > 0) {
            if ((N & 1) == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                ans *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            N >>= 1;
        }
        return ans;
    }
}
