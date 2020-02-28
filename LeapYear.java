package com.company;
import javax.swing.*;

class LeapYear {
    public static void main(String args[]) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Please fill in an year:"));
        if((((input % 4) == 0) && !((input % 100) == 0)) || ((input % 400) == 0)) {
            System.out.println(input + " is a leap year.");
        } else {
            System.out.println(input + " is not a leap year.");
        }
        System.exit(0);
    }
}
