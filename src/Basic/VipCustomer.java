package Basic;

public class VipCustomer {
 // name , credit limit,email address
    private String name;
    private double creditLimit;
    private String CustEmail;

    public VipCustomer(){
        System.out.println("default constructor has been called");
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.CustEmail="default";
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.CustEmail = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return CustEmail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmailAddress(String emailAddress) {
        this.CustEmail = emailAddress;
    }
}
