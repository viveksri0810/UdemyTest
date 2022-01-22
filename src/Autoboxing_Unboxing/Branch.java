package Autoboxing_Unboxing;

import java.util.ArrayList;

public class Branch {

    String branchName;
    ArrayList<Customer> customer;

    public Branch(String branchName) {
        this.branchName = branchName;
        customer=new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String customerName){
        customer.add(new Customer(customerName));
    }

    public void addCustomer(String customerName,double amt){
        customer.add(new Customer(customerName,amt));
    }

    public void addtxn(String customerName, double amt){
       int arrayLength =customer.size();
       int temp = 0;
       for (int i=0;i<arrayLength;i++){
           if(customer.get(i).getName().equals(customerName)){
               temp=i;
               break;
           }
       }

       customer.get(temp).setDoubleArrayList(amt);
    }

    @Override
    public String toString() {
        return '\n' + "Branch{" +
                "branchName='" + branchName + '\'' +
                '}';
    }
}
