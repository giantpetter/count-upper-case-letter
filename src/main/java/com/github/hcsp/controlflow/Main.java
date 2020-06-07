package com.github.hcsp.controlflow;

import static java.lang.Character.isUpperCase;

public class Main {
    /**
     * 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。
     *
     * <p>例如，给定字符串"AaBbCc1234ABC"，返回6，因为该字符串中出现了6次大写英文字母ABCABC
     *
     * @param str 给定的字符串
     * @return 字符串中大写英文字母出现的次数
     */
    public static int countUpperCaseLetters(String str) {
        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >='A' && str.charAt(i) <= 'Z') {
//                count++;
//            }
//        }
        for (char c : str.toCharArray()) {
            if (isUpperCase(c)){
                count += 1;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countUpperCaseLetters("AaBbCc1234ABC");
    }
}
