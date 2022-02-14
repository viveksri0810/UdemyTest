package Autoboxing_Unboxing;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        branches=new ArrayList<>();
    }

    public String addBranch(String branchName){
        int arrayLength=branches.size();
        int temp=0;
        for (int i=0;i<arrayLength;i++){
            if(branches.get(i).branchName.equals(branchName)){
                return "branch already exist";
            }
        }
        branches.add(new Branch(branchName));
        return "branch added";
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

}
