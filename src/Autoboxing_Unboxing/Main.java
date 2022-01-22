package Autoboxing_Unboxing;

public class Main {

    public static void main(String[] args) {
        Bank bank=new Bank("SBI");
        bank.addBranch("SBI PIPIGANJ");
        bank.addBranch("SBI BHAGWANPUR");
        bank.addBranch("SBI GORAKHPUR");

        System.out.println(bank.getBranches());

    }
}

