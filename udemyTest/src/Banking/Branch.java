package Banking;

import java.util.ArrayList;

public class Branch {

    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

//    public boolean newCustomer(String customerName,double initialAmount){
//        if(findCustomer(customerName)==null){
//            this.customers.add(new Customer(customerName,initialAmount));
//            return true;
//        }
//        return false;
//    }

}
