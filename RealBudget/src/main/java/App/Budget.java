/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.Scanner;

/**
 *
 * @author peter.johnson
 */
public class Budget {
    
    private String month;

private double Salary;

private double food;

private double rent;

private double creditCard;

private double utilities;

private double clothing;

private double entertainment;

private double personalCare;

Scanner userinput = new Scanner(System.in);

/**

*

*/

public Budget() {

this.month = "";

this.Salary = 0;

this.food = 0;

this.rent = 0;

this.utilities = 0;

this.clothing = 0;

this.entertainment = 0;

this.personalCare = 0;

this.creditCard = 0;

}

public Budget(String month, double budget, double food, double rent, double utilities, double clothing, double entertainment, double personalCare, double bills) {
        this.month = month;
        this.Salary = budget;
        this.food = food;
        this.rent = rent;
        this.utilities = utilities;
        this.clothing = clothing;
        this.entertainment = entertainment;
        this.personalCare = personalCare;
        this.creditCard = bills;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

    public double getUtilities() {
        return utilities;
    }

    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }

    public double getClothing() {
        return clothing;
    }

    public void setClothing(double clothing) {
        this.clothing = clothing;
    }

    public double getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(double entertainment) {
        this.entertainment = entertainment;
    }

    public double getPersonalCare() {
        return personalCare;
    }

    public void setPersonalCare(double personalCare) {
        this.personalCare = personalCare;
    }

    public Scanner getUserinput() {
        return userinput;
    }

    public void setUserinput(Scanner userinput) {
        this.userinput = userinput;
    }

public double totalExpenses() {

return (food + rent + utilities + clothing + entertainment + personalCare);

}

public double getAvailableMoney(){
    return(Salary - rent - food - creditCard - utilities);
}

    
}
