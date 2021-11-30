package com.example.demo.algorithm.simple;

import org.junit.Test;
import org.springframework.scheduling.annotation.Async;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


/**
 * @author by lizyang @on 2021/7/21 11:39
 * @description:
 */
public class a5有效的括号 {

    static class Solution {
        public static boolean isValid(String s) {
            int n = s.length();
            // 奇数不符合，直接返回
            if (n % 2 == 1) {
                return false;
            }

            // 缓存对应关系
            Map<Character, Character> pairs = new HashMap<Character, Character>(3) {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};
            // 双向链表
            Deque<Character> stack = new LinkedList<Character>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (pairs.containsKey(ch)) {
                    // 存在出栈
                    if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                        return false;
                    }
                    stack.pop();
                } else {
                    // 不存在入栈
                    stack.push(ch);
                }
            }
            // 不包含直接返回空
            return stack.isEmpty();
        }

        //        public static void main(String[] args) {
//            System.out.println(isValid("[]{(})"));
//        }

    }


}
