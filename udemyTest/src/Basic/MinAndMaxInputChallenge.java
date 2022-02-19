package Basic;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter next number : ");
            boolean hasNextInt = scan.hasNextInt();
            if (hasNextInt) {
                int nextNumber = scan.nextInt();
                counter++;
                if (counter == 1) {
                    min = nextNumber;
                    max = nextNumber;
                } else {
                    if (nextNumber <= min) {
                        min = nextNumber;
                    }
                    if (nextNumber >= max) {
                        max = nextNumber;
                    }
                }
            } else {
                break;
            }
//             scan.nextLine();
        }
        scan.close();
        System.out.println("Max number is " + max + " Min number is " + min);

    }
}
