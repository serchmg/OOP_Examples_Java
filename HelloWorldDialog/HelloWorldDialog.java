package com.oops.chap1;
import javax.swing.JOptionPane;

public class HelloWorldDialog {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter your name");
		String message = String.format("Welcome %s to OOP in java",input);
		JOptionPane.showMessageDialog(null,message);
		//System.out.println("Si funciona");
	}
}

//package com.oops.chap1;

//public class HelloWorldDialog {
//	public static void main(String[] args) {
//		System.out.println("Welcome to Object Oriented Programming in Java ");
//	}
//}
