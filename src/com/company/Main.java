package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite Kilometrus ");
        float km = scanner.nextFloat();

        System.out.println("Iveskite Kuro Sanaudas ");
        float ks = scanner.nextFloat();

        System.out.println("Kuro sanaudos: " + (ks * 100 ) / km);
    }
}
