package Banking;

import java.util.ArrayList;

public class Customer {

    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(transactions);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
