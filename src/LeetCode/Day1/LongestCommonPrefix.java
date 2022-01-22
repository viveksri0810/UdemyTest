package LeetCode.Day1;

import java.util.Arrays;
import java.util.Collections;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = {"flowera", "floweras", "flower"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(strs[0]);
        int strArryLength = strs.length;
        int lenth = strs[0].length();
        boolean bol = true;
        int i = 0;


        while (i < lenth && bol==true) {
            int j = 1;
            while (j < strArryLength) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    bol=false;
                    break;
                }
                j++;
            }
            if (!bol){
                break;
            }
            i++;
        }


        if (i == 0) {
            return "There is no common prefix among the input strings.";
        } else {
            String str = "";
            for (int j = 0; j < i; j++) {
                str += strs[0].charAt(j);
            }
            return str;
        }
    }
}
