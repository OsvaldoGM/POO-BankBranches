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
public class Branch {
    private ArrayList<Costumer> customer;
    private String name;

    public Branch(String name) {
        this.customer = new ArrayList<Costumer>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Costumer> getCustomer() {
        return customer;
    }
    
    public boolean addCostumer (Costumer costumer){
        if(findCostumer(costumer.getName())== -1){
            System.out.println("Successfully added costumer ");
            customer.add(costumer);
            return true;
        }
        System.out.println("Costumer already existing");
        return false;
    }
    
    
    public boolean addCostumer(String name, double amount){
        return addCostumer(new Costumer(name,amount));
    }
    
    public boolean addTransaction(String name, double amount){
        int position = findCostumer(name);
        if(position == -1){
            System.out.println("Non existen customer");
            return false;
        }else{
            System.out.println("Sucessfull transaction");
            customer.get(position).addTransaction(amount);
            return true;
        }
    }
    

    public int findCostumer (String name){
        for(int i=0; i<customer.size(); i++){
            if (customer.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
