/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.branches;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class BankBranches {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner (System.in);
    public static Bank myBank = new Bank ();
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bank myBank = new Bank ();
        int option;
        
        printMenu();
        option = scanner.nextInt();
        while (option >0 && option <6){
            switch(option){
                case 1:
                    addBranch();
                    break;                    
                case 2: 
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    List();
                    break;
                     
                case 5: 
                    listWithtransactions();

                default: 
                    break;          
            } 
             
            System.out.print("Option? ");
            option = scanner.nextInt();
         }
      
    }
    
    
    public static void printMenu(){
        System.out.println("Menu: ");
        System.out.println("0. Quit");
        System.out.println("1. Add branch");
        System.out.println("2. Add customer");
        System.out.println("3. Add transaction");
        System.out.println("4. Print customer list");
        System.out.println("5. Print customer list with transaction");  
    }

    public static void addBranch(){
        String name;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Add Branch:");  
        name = scanner.nextLine();
        myBank.addBranch(name);
    }
    
    public static void addCustomer(){
        String name, costumer;
        double amount;
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Branch: ");  
        name = scanner.nextLine();
        System.out.print("Add Customer: ");  
        costumer = scanner.nextLine();
        System.out.print("Amount: ");  
        amount = scanner.nextDouble();
        myBank.addCostumer(name,costumer, amount);
    }
    
    public static void addTransaction(){
        String name, costumer;
        double amount;
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Branch : ");  
        name = scanner.nextLine();
        System.out.print("Customer: ");  
        costumer = scanner.nextLine();
        System.out.print("Amount: ");  
        amount = scanner.nextDouble();
        myBank.addTransaction(name, costumer, amount);
        
    }
    
    public static void List(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Name of the branch");
        String name = scanner.nextLine();
        myBank.customersList(name);
    }
    
    public static void listWithtransactions(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Name of the branch");
        String name = scanner.nextLine();
        myBank.customersTransactionList(name);
    }
}
