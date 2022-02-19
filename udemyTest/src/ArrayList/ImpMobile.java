package ArrayList;

import java.util.ArrayList;

public class ImpMobile {

    ArrayList<Contacts> contact = new ArrayList<>();


    public void addContact(String firstName, int num) {
        Contacts con = new Contacts(firstName, num);
        contact.add(con);
        System.out.println(con + "has been added");

    }

    private int findContact(String firstName) {
        int index = -1;
        for (Contacts con : contact) {
            if (con.getFirstName().equalsIgnoreCase(firstName)) {
                index = contact.indexOf(con);
                break;
            }
        }
        return index;
    }


    public void modifyContact(String firstName, int num) {
        int index = findContact(firstName);
//        for (Contacts con : contact){
//            if( con.getFirstName() == firstName){
//                index=contact.indexOf(con);
//                break;
//            }
//        }
        if (index >= 0) {
            Contacts temp = contact.get(index);
            contact.set(index, new Contacts(firstName, num));
            System.out.println(temp + " has been modified as " + contact.get(index));
        } else {
            System.out.println(firstName + " not found");
        }

    }


    public void removeContact(String firstName) {
        int index = findContact(firstName);
//        for (Contacts con : contact){
//            if( con.getFirstName() == firstName){
//                index=contact.indexOf(con);
//                break;
//            }
//        }
        if (index >= 0) {
            Contacts temp = contact.get(index);
            contact.remove(index);
            contact.remove(index);
            System.out.println(temp + " has been removed");
        } else {
            System.out.println(firstName + " not found");
        }
    }


    public void listContact() {

        System.out.println("Printing Contacts from list");

        for (Contacts con : contact) {

            System.out.println(con);
            System.out.println("my");
        }

    }
}
