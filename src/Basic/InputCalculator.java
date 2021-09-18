package Basic;

import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void main(String[] args) {
        InputCalculator.inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum =0;
        int count=0;
        double avg=0;
        Scanner scan=new Scanner(System.in);
        while(true){
            boolean hasNextInt=scan.hasNextInt();
            if(hasNextInt){

                sum +=scan.nextInt();
                count ++;
                avg=Math.round((double)sum/count);

            }
            else {
                System.out.println("SUM = "+sum+ " AVG = "+(int)avg);
                break;
            }
        }

    }
}