package LeetCode.Day1;

import java.util.Scanner;

public class RomanNumber {

    public static void main(String[] args) throws Exception {



        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Value : ");
        String str = scan.next();
        scan.close();


        boolean bool=isStringValid(str);
//        System.out.println(bool);
        if (bool){
            int number=romanToDecimal(str);
            System.out.println(number);
        }else {
            System.out.println("Invalid Roman no");
        }


    }
    public static boolean isStringValid(String str){
        int strLength=str.length();
        int i=0;
        while ( i <strLength){
            if(str.charAt(i)=='I'){
                i++;
            }else if (str.charAt(i)=='V') {
                i++;
            }else if (str.charAt(i)=='X') {
                i++;
            }else if (str.charAt(i)=='L') {
                i++;
            }else if (str.charAt(i)=='C') {
                i++;
            }else if (str.charAt(i)=='D') {
                i++;
            }else if (str.charAt(i)=='M') {
                i++;
            }else {
                return false;
            }
        }
    return true;
    }

    public static int romanToDecimal(String str){

        int strLength=str.length();
        int i=1;
        int sum=value(str.charAt(0));


        while ( i <strLength){
            if(value(str.charAt(i))<=value(str.charAt(i-1))) {
                sum += value(str.charAt(i));
            }else {
                sum=sum+value(str.charAt(i))-(2*value(str.charAt(i-1)));
            }
            i++;
        }
        return  sum;
    }

    public static int value(char r){
        if(r=='I'){
            return 1;
        }else if (r=='V') {
            return 5;
        }else if (r=='X') {
            return 10;
        }else if (r=='L') {
            return 50;
        }else if (r=='C') {
            return 100;
        }else if (r=='D') {
            return 500;
        }else if (r=='M') {
            return 1000;
        }
        return -1;
    }
}
