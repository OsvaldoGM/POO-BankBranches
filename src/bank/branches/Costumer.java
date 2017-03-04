/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.branches;

import java.util.ArrayList;

/**
 *
 * @author Osvaldo
 */
public class Costumer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList();

    public Costumer(String name, double amount) {
        this.name = name;
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }
    
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
