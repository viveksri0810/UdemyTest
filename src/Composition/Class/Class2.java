package Composition.Class;

public class Class2 {
    private int d;
    private int e;
    private int f;
    private Class1 class1;



    public Class2(int d, int e, int f,int a,int b, int c) {
        this.d = d;
        this.e = e;
        this.f = f;
        class1=new Class1(a,b,c);
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
