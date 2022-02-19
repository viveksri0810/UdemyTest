package accessModifier;

public class Main {

    public static void main(String[] args) {
        int a = AccessModifireInterface.a1;
        int b = IAccessModifireInterface.b1;

        int f;

        IAccessModifireInterface c = new IAccessModifireInterface();
        c.myname();
        int a3 = c.a;

        AccessModifireAbstract d = new IAccessModifireInterface();
        d.myname1();


    }

    public static void asw() {

        int a22;
    }

    public void hewo() {
        System.out.println("sdf");
        int a;
    }

}

