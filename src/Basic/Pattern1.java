package Basic;

public class Pattern1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            a--;
            for (int j = 1; j <= 10 + b; j++) {
                System.out.print("*");
            }
            b += 2;
            System.out.println();
        }
    }
}