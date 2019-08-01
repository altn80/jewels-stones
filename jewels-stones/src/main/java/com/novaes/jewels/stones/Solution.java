/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.jewels.stones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author andre
 */
public class Solution {

    /**
     * @param J: the types of stones that are jewels
     * @param S: representing the stones you have
     * @return: how many of the stones you have are also jewels
     */
    public int numJewelsInStones(String J, String S) {
        if(J.isEmpty() || S.isEmpty()) {
            return 0;
        }
        String[] arrayJewels = J.split("");
        int result = 0;
        for (String jewel : arrayJewels) {
            Pattern pattern = Pattern.compile(jewel);
            Matcher matcher = pattern.matcher(S);
            while (matcher.find()) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }
}
