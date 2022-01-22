package LeetCode.Day1;

import Basic.CharAt;

public class isPalindrome {

    public static void main(String[] args) {
        int x=00;
        System.out.println(isPalindrome(x));


    }
    public static  boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        else {
            String str = String.valueOf(x);
            int lengthOfNum = str.length() - 1;
            String  temp ="" ;
            for (int i = lengthOfNum; i >= 0; i--) {

                temp += str.charAt(i);
            }
            if (str.equals(temp)){
               return true;
            }
            else {
                return false;
            }
        }
    }
}
