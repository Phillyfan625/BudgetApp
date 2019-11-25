/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import View.MainMenu;
import Model.Budget;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author peter.johnson
 */
public class App {
    
 
    public static void main(String[] args){
        
        
       
        
        
        Scanner input = new Scanner(System.in);
        
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        Budget bud = new Budget();
      
        
        System.out.println("Enter 1: Current Balance");
        System.out.println("Enter 2: Chat Application");
        int selection = input.nextInt();
        
        if(selection == 1){
             //salary
        System.out.print("Enter your Current Salary: ");
        bud.setSalary(input.nextDouble());
        
       // System.out.println("This is your Salary: " + bud.getSalary());
        
               
        //rent
         System.out.print("Enter your Rent: ");
        bud.setRent(input.nextDouble());
        
        //System.out.println("This is your Rent: " + bud.getRent());
        
        //food
         System.out.print("Enter what you pay for food: ");
        bud.setFood(input.nextDouble());
        
       // System.out.println("This is what you paid for food: " + bud.getFood());
        
        //credit card
         System.out.print("Enter your Credit Card Balance: ");
        bud.setCreditCard(input.nextDouble());
       
        //System.out.println("This is your Credit Card Balance: " + bud.getCreditCard());
        
        //utilities
         System.out.print("Enter what you pay for Utilities: ");
        bud.setUtilities(input.nextDouble());
        
       // System.out.println("This is what you pay for Utilities: " + bud.getUtilities());
        
         printAvailableMoney(bud);
        
            
        }
        
        else{
            System.out.println("Welcome to the chat application");
             System.out.print("Enter your Current Salary: ");
             bud.setSalary(input.nextDouble());
            System.out.print("Enter your Rent: ");
            bud.setRent(input.nextDouble());
             System.out.print("Enter what you pay for food: ");
             bud.setFood(input.nextDouble());
         System.out.print("Enter your Credit Card Balance: ");
        bud.setCreditCard(input.nextDouble());
         System.out.print("Enter what you pay for Utilities: ");
        bud.setUtilities(input.nextDouble());
        
            System.out.print("Enter how much the item you want is: ");
            double userGift = input.nextDouble();
            
            if(userGift <= bud.getAvailableMoney()){
                System.out.println("You can afford it!");                
            }
            else{
                System.out.println("YOU DO NOT HAVE ENOUGH!");
        }
        
        }
        
       
        
        }
    
    public static void printAvailableMoney(Budget bud){
               
        System.out.println("This is your available balance: " + bud.getAvailableMoney());
       
    
        }
        
 public static String affordGift(Budget bud, double userGift){
            
         if(userGift <= bud.getAvailableMoney()){
                return "You can afford it!";                
            }
            else{
               return "YOU DO NOT HAVE ENOUGH!";
        }
               
       
       
    
        }
      
       

    }
    

