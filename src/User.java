public class User {
    public static void main(String[] args) {

        BankAccount openNew=new BankAccount();
        openNew.setCustAccountNo(12345);
        openNew.setCustName("Vivek");
        openNew.setCustEmail("vivek@gmail.com");
        openNew.setCustPhoneNo("9565649427");
        openNew.setCustAccountBal(500);


        System.out.println("Account has been successfully created " + '\n'
                + "your account no is " + openNew.getCustAccountNo() + '\n'
                + "your name is "+openNew.getCustName() + '\n'
                + "your email id is "+openNew.getCustEmail() + '\n'
                + "your mobile no is "+openNew.getCustPhoneNo() + '\n'
                + "your Available balance is "+ openNew.getCustAccountBal()
                + "your credit limit is "+ openNew.getCreditLimit()
                );

        System.out.println(openNew.withdrawlAmount(500));
        System.out.println(openNew.depositAmount(1000));
        System.out.println(openNew.withdrawlAmount(1300));
        System.out.println(openNew.depositAmount(0));
        System.out.println(openNew.withdrawlAmount(0));

//        VipCustomer cust=new VipCustomer();
//        System.out.println(cust.getName() + " "+ cust.getCreditLimit() + " " + cust.getEmailAddress());
//        VipCustomer cust1=new VipCustomer("Vivek",100.00);
//        System.out.println(cust1.getName() + " "+ cust1.getCreditLimit() + " " + cust1.getEmailAddress());
//        VipCustomer cust2=new VipCustomer("sri",200.00,"sri@gmail.com");
//        System.out.println(cust2.getName() + " "+ cust2.getCreditLimit() + " " + cust2.getEmailAddress());
       }
}
