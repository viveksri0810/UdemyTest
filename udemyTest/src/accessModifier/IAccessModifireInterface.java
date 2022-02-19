package accessModifier;

public class IAccessModifireInterface extends AccessModifireAbstract implements AccessModifireInterface {

    int a = 0;
     int b = 0;

    @Override
    public void hello() {

    }

    @Override
    public void myname() {
        System.out.println("Vivek");
    }


    @Override
    void hello1() {

    }

    @Override
    void myname1() {

    }
}
