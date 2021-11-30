package com.example.demo.algorithm.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by lizyang @on 2021/7/20 14:27
 * @description:
 */
public class a6罗马数字转数字 {

    static class Solution {
        // 将转换关系map缓存
        static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        public static int romanToInt(String s) {
            int ans = 0;
            int n = s.length();
            for (int i = 0; i < n; ++i) {
                int value = symbolValues.get(s.charAt(i));
                // 加减判断
                if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                    ans -= value;
                } else {
                    ans += value;
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            System.out.println(romanToInt("IV"));
        }
    }


}
