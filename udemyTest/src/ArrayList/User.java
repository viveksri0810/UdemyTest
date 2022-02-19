package ArrayList;

public class User {

    public static void main(String[] args) {
        ImpMobile impMobile = new ImpMobile();

        impMobile.addContact("viv0", 1234);
        impMobile.addContact("viv1", 12345);
        impMobile.addContact("viv2", 12346);
        impMobile.addContact("viv3", 12347);
        //impMobile.listContact();
        impMobile.removeContact("viv0");
        // impMobile.listContact();
        impMobile.modifyContact("viv2", 12348);
    }
}
