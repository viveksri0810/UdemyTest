package Series;

public class Series {

    public int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int fibonacci(int n) {

        int f0 = 0;
        int f1 = 1;
        int fn = 0;


        if (n == 1) {
            return f0;
        } else if (n == 2) {
            return f1;
        } else {
            for (int i = 3; i <= n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            return fn;
        }
    }
}
