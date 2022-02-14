package Basic;

import java.util.Scanner;

public class AutomaticHands {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the block picked by first hand : ");
        int a=scan.nextInt();
        System.out.print("Please enter the block picked by second hand : ");
        int b=scan.nextInt();

        boolean bol;
        bol = false;

        if(a >0 && a<5000 && b>0 && b<2500) {
            if (a / 2 == b) {
                bol = true;
            }
        }
        System.out.println(bol);

    }
}
