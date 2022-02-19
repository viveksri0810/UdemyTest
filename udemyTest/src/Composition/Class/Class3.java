package Composition.Class;

public class Class3 {
    private final int d;
    private final int e;
    private final int f;
    private final Class1 class1;


    public Class3(int d, int e, int f, int a, int b, int c) {
        this.d = d;
        this.e = e;
        this.f = f;
        class1 = new Class1(a, b, c);
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public Class1 getClass1() {
        return class1;
    }
}
