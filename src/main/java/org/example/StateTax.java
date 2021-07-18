package org.example;
import java.util.Scanner;
public class StateTax {
    private int order;
    private String state;
    public int getOrder(){
        return order;
    }
    public void setOrder(int order){
        this.order = order;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public void getTaxRate(String state, int order){
        Scanner scanner = new Scanner(System.in);
        if(state.equalsIgnoreCase("Wisconsin")){
            System.out.println("What county do you live in?: ");
            String county = scanner.nextLine();
            if(county.equalsIgnoreCase("Eau Claire")){
                double tax = 0.055;
                double totalOrder = Math.round(((tax * order) + order)*100.0)/100.0;
                System.out.println("The tax is $" + tax);
                System.out.println("The total is $" + totalOrder);
            }
            else if(county.equalsIgnoreCase("Dunn")){
                double tax = 0.054;
                double totalOrder = Math.round(((tax * order) + order)*100.0)/100.0;
                System.out.println("The tax is $" + tax);
                System.out.println("The total is $" + totalOrder);
            }
            else {
                double tax = 0.05;
                double totalOrder = Math.round((((tax*order)) + order)*100.0)/100.0;
                System.out.println("The tax is $" + tax);
                System.out.println("The total is $" + totalOrder);
            }
        }
        else if(state.equalsIgnoreCase("Illinois")){
            System.out.print("What county do you live in?: ");
            double tax = 0.08;
            double totalOrder = Math.round((((tax*order))+order)*100.0)/100.0;
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + totalOrder);
        }
        else{
            System.out.println("What county do you live in?: ");
            System.out.println("The total is $" + order);
        }
    }
}
