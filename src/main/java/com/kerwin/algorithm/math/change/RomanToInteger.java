package com.kerwin.algorithm.math.change;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 罗马数字转整数[1 3999]
 * @see IntegerToRoman
 *
 * @link https://leetcode-cn.com/problems/roman-to-integer
 * @Author KerVinLi
 * @Version 1.0
 */
public class RomanToInteger {

    static Map<Character, Integer> map = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * 小值放在大值的左边，就是做减法，否则为加法
     * 可以往后看多一位，对比当前位与后一位的大小关系，从而确定当前位是加还是减法。当没有下一位时，做加法即可
     * @param s
     * @return
     */

    public static int romanToInt(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int sum =0;
        int preNum = map.get(s.charAt(0));
        for(int index = 1 ;index < s.length(); index++){
            int value = map.get(s.charAt(index));
            if(preNum < value){
                sum -= preNum;
            }else{
                sum += preNum;
            }
            preNum = value;
        }
        sum += preNum;
        return  sum;
    }
}
