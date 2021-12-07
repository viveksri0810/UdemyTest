package Inheritance;

public class Test1 implements Test {

    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a - b);

    }

    @Override
    public void multiply(int a, int b) {
        System.out.println(a * b);

    }

    @Override
    public void divide(int a, int b) {
        System.out.println(a / b);

    }
}
