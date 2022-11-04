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
}
