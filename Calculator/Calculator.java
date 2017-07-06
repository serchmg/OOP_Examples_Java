package com.oops.chap1;

import javax.swing.*;

public class Calculator {
	public static void main(String[] args) {
		String number1, number2, choice;
		int num1, num2, result, ch;
		number1 = JOptionPane.showInputDialog("Enter first number: ");
		number2 = JOptionPane.showInputDialog("Enter second number: ");
		choice = JOptionPane.showInputDialog("Enter 1 - Addition :\n 2 - Subtraction ");
		num1 = Integer.parseInt(number1);
		num2 = Integer.parseInt(number2);
		ch = Integer.parseInt(choice);

		if(ch == 1) {
			result = num1+num2;
		} else {
			result = num1-num2;
		}
		JOptionPane.showMessageDialog(null, "The result is "+result, "Answer", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}
