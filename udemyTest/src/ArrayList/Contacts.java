package ArrayList;

public class Contacts {

    String firstName;
    int number;

    public Contacts(String firstName, int number) {
        this.firstName = firstName;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", number=" + number +
                '}';
    }
}
