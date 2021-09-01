package com.kerwin.algorithm.string.sub;

/**
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * 提示：
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 *
 * @link https://leetcode-cn.com/problems/longest-common-prefix
 * @Author KerVinLi
 * @Version 1.0
 */
public class LongestCommonPrefix {
    /**
     * 1.横向扫描<br/>
     * 先获取前两个字符串的公共前缀，再与第三个字符串获取公共前缀
     * @param strings
     * @return
     */
    public static String rowLongestCommonPrefix(String[] strings){
        if(strings == null || strings.length == 0){
            return "";
        }
        String prefix = strings[0];
        for(int i =1,len= strings.length;i<len;i++){
            prefix = longestCommonPrefix(prefix,strings[i]);
            //两个字符串公共前缀为空串 就直接返回
            if(prefix.length() == 0){
                break;
            }
        }

        return prefix;
    }

    /**
     * 获取两个字符串的公共前缀
     * @param str1
     * @param str2
     * @return
     */
    private static String longestCommonPrefix(String str1, String str2){
        int minLength = Math.min(str1.length(),str2.length());
        int index = 0;
        while (index < minLength && str1.charAt(index) == str2.charAt(index)){
            index ++;
        }
        return str1.substring(0,index);
    }
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * 2.纵向扫描<br/>
     * 纵向扫描时，从前往后遍历所有字符串的每一列，比较相同列上的字符是否相同<br/>
     * 如果相同则继续对下一列进行比较<br/>
     * 如果不相同则当前列不再属于公共前缀，当前列之前的部分为最长公共前缀<br/>
     * @param strings
     * @return
     */
    public static String colLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for(int i =0,len = prefix.length();i<len;i++){
            char c = prefix.charAt(i);
            for(int j = 1,count=strings.length;j<count;j++){
                if(i == strings[j].length() || c != strings[j].charAt(i)){
                    return prefix.substring(0,i);
                }
            }
        }

        return prefix;
    }

}
