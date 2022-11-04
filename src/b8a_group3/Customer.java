/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group3;

/**
 *
 * @author دلال السلمي
 */
import java.util.*;
public class Customer {
    private ArrayList<String> orders = new ArrayList<String>();
     private String FisrtStreetName , LastStreetName;  
    private String CardNumber;
    private String CCV;
    private String neighborhoodName;
    
    
   //--------------------------------------------
    Customer(){
        
    }
    //search();
    public void addOrder(String[] typeAndFlavor){
        for (int i = 0; i < typeAndFlavor.length; i++) {
            if(typeAndFlavor[i] != null){
                 orders.add(typeAndFlavor[i]);
            }
        }
    }
    public ArrayList<String> allOrders(){
        return orders;
    }
    
    public void Payment(){
        System.out.println("\nWelcome to the payment page ♡ ♡ ♡");
        System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
        System.out.println("1- Credit Card");
        System.out.println("2 - Cash");
        System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");  

    }
    
    public void Credit_Card(Scanner input) {
        System.out.print("Enter Card Number: (Consists of 10 numbers) :");
        CardNumber = input.next();
        if (CardNumber.length() != 10) {
            System.out.println("Invalid Card Number ! Try again");
            System.out.println("Enter Card Number: (Consists of 10 numbers) ");
            CardNumber = input.next();
        }
        System.out.print("Enter CCV Number: (Consists of 3 numbers): ");
        CCV = input.next();
            if (CCV.length() != 3) {
                System.out.println("Invalid CVV number ! Try again");
                System.out.println("Enter CCV Number: (Consists of 3 numbers)");
                CCV = input.next();
            }
            System.out.println("\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");  
            System.out.println("         Payment completed");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");    
        } 
    
    public void Cash(Scanner input,int total){
        if (total > 20) {
        System.out.print("Enter the name of the neighborhood:");
        neighborhoodName=input.next();
        System.out.print("The Street Nmae:");
        FisrtStreetName=input.next();
        LastStreetName=input.next();
        System.out.println("\n☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");  
        System.out.println("Your order has been confirmed");
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆"); 
        }else {
        System.out.println("To use this feature, your total must be over $20");
        System.out.println("Your Total Amount now is "+total);
        System.out.println("We are sorry that this feature is not available to you (˃̣̣̥∩˂̣̣̥)");
        }
       
         
        
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }
   

    

    public String getCardNumber() {
        return CardNumber;
    }

   

    public String getCCV() {
        return CCV;
    }

    public String getStreetName() {
        return FisrtStreetName;
    }

    public String getLastStreetName() {
        return LastStreetName;
    }
}
