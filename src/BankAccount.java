public class BankAccount extends VipCustomer{

    private int custAccountNo;
    private String custName;
    private String custEmail;
    private String custPhoneNo;
    private double custAccountBal;


    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getCustAccountBal() {
        return custAccountBal;
    }

    public void setCustAccountBal(double custAccountBal) {
        this.custAccountBal = custAccountBal;
    }

    public String getCustPhoneNo() {
        return custPhoneNo;
    }

    public void setCustPhoneNo(String custPhoneNo) {
        this.custPhoneNo = custPhoneNo;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public int getCustAccountNo() {
        return custAccountNo;
    }

    public void setCustAccountNo(int custAccountNo) {
        this.custAccountNo = custAccountNo;
    }

    public String withdrawlAmount(int amount){
        if(amount<=0){
            return "please enter a valid amount";
        }
        else if(custAccountBal<amount){
            return "Insufficient Balance. Your available account balance is : "+custAccountBal+".";
        }
        else if(custAccountBal>=amount){
            custAccountBal-=amount;
            return amount+" has been successfully withdrawn and available balance is : "+custAccountBal+".";
        }
        else {
            return "error";
        }
    }
    public String depositAmount(int amount){
        if(amount>0){
            custAccountBal=custAccountBal+amount;
            return amount+" has been Successfully deposited in account. Available balance is : "+custAccountBal+".";
        }
        else {
            return "Please enter a valid amount.";
            }
    }
}
