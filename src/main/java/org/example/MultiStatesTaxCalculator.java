package org.example;
import java.util.Scanner;
public class MultiStatesTaxCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the order amount?: ");
        int amount = scanner.nextInt();
        System.out.println("What state do you live in?: ");
        String state = scanner.next();
        StateTax selectedState = new StateTax();
        selectedState.setOrder(amount);
        selectedState.setState(state);
        selectedState.getTaxRate(state, amount);
    }
}
