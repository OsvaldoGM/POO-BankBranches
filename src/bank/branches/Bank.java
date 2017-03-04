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
public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }
    
    
    public boolean addBranch(String name){
        int position = findBranch(name);
        if(position == -1){
            branches.add(new Branch(name));
            System.out.println("Sucessfully added branch");
            return true;
        }
        System.out.println("Branch alrady existing");
        return false;
    }
    
    public boolean addCostumer(String name, String costumer, double amount){
        int position = findBranch(name);
        if (position != -1) {
               branches.get(position).addCostumer(costumer,amount);
               System.out.println("Costumer succesfully added to that branch");
               return true;
           } else {
               System.out.println("Non exiting branch");
               return false;
           }
    }
    
    public boolean addTransaction(String name, String costumer, double amount){
        int position = findBranch(name);
            if(position == -1){
                System.out.println("Non existent");
               return false;
        } else {
                branches.get(position).addTransaction(costumer,amount);
                return true;
        }
    }
    
    public int findBranch (String name){
        for(int i=0; i<branches.size(); i++){
            if (branches.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
        
    }
    
    public String customersList(String name) { 
        int position = findBranch(name);
        String list = "";
        if(position != -1){
           list += branches.get(position).getName() + ":\n";
            ArrayList<Costumer> branch = branches.get(position).getCustomer(); 
            for(int i = 0; i < branch.size(); i++){ 
                Costumer customer = branch.get(i); 
               list += "Name:" + customer.getName() + "\n";
            }
            return list;
        }
        return "Non existing branch";
    }
    
    public String customersTransactionList(String name) {
        int position = findBranch(name);
        String list = "";
        if(position != -1){
           list += branches.get(position).getName() + ":\n";
            ArrayList<Costumer> branch = branches.get(position).getCustomer();
            for(int i = 0; i < branch.size(); i++){
                Costumer customer = branch.get(i);
                list += "Name : " + customer.getName() + "\n";
                    ArrayList<Double> transactions = customer.getTransactions(); 
                        for(int j = 0; j < transactions.size(); j++){ 
                            list += "No." + (j+1) + ":" + transactions.get(j) + "\n"; 
                        }
            }
            return list;
        }
        return "Non existing branch";
    }
}
