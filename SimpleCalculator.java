package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double num1, num2;
        String operator;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first number:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second number:"));
        operator = JOptionPane.showInputDialog("Please select an operator (+, -, *, /, ^)");
        double result = 0;
        switch(operator) {
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 - num2;
                break;
            case "*": result = num1 * num2;
                break;
            case "/": result = num1 / num2;
                break;
            case "^": result = Math.pow(num1, num2);
                break;
            // Non valid operator (+, -, *, /, ^)
            default: System.out.println("You have not selected a valid operator!");
        }
        JOptionPane.showMessageDialog(null, "The result is: " + result);
        System.exit(0);
    }
}

