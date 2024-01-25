package com.day2Hw;
import java.util.Scanner;
import java.io.Console;

public class SecureInputExample {
    public static void main(String[] args) {
    	Console console = System.console();

        char[] password = console.readPassword("Enter your password: ");
        String maskedInput = new String(new char[password.length]).replace('\0', '*');

        System.out.println("You entered: " + maskedInput);
    }
}
