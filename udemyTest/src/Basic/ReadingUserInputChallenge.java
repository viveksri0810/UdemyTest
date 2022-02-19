package Basic;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        System.out.println("please enter 10 numbers");
        Scanner scan = new Scanner(System.in);
        while (i <= 10) {
            System.out.print("Enter number " + i + " : ");
            boolean hasNextInt = scan.hasNextInt();
            //           System.out.println();
            if (hasNextInt) {
                sum += scan.nextInt();
            } else {
                System.out.println("Invalid Number, Please enter a valid number");
                i--;
//                System.out.print("Enter number "+ i + " : ");
//                sum =+ scan.nextInt();
            }
            scan.nextLine();
            i++;
        }
        scan.close();
        System.out.println("Sum of number is : " + sum);
    }
}
