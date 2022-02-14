package Chandan;

public class Test {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            int y = i % 10;
            if (y == 1 || y == 3 || y == 6 || y == 8) {
                System.out.println("Red");
            } else {
                System.out.println("Green");
            }
            i++;
        }
    }
}
