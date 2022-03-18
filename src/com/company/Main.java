package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int price = 117697000;

        System.out.println("Welcome our GM Uzbekistan!\n");
        System.out.println("We have Lacetti to leasing \nLacetti L-ELEGANT/AT PLUS - " + price + " so'm");
        System.out.println("       ---------------        ");
        System.out.println("      /                \\");
        System.out.println("     /                  \\");
        System.out.println(" -------------------------------------        ");
        System.out.println("(|                                   |)       ");
        System.out.println(" ---000-------------------------000---        ");
        System.out.println("  00   00                     00   00        ");
        System.out.println("    000                         000        ");

        System.out.println("\n enter initial amount to pay");

        Scanner scanner = new Scanner(System.in);
        int amount = (int) scanner.nextInt();

        System.out.println("\n enter interest rate daily:");
        Scanner sc = new Scanner(System.in);
        double rate = (double) scanner.nextDouble();

        System.out.println("\n enter payment period days");

        Scanner scanner1 = new Scanner(System.in);
        int days = (int) scanner1.nextInt();

        int leasing = (int) ((price - amount) * rate);
        int interest = (int) ((price - amount) * (rate / 100));
        int years = days / 365;
        int month = ((days - (years * 365)) / 30);
        int day = days - ((years * 365) + (month * 30));
        System.out.println("Leasing = " + leasing + "\n" + "interest rate = " + interest);
        int total = interest * days + leasing;
        System.out.println("\n you need to pay " + total + "sums to company during " + days + "days");
        System.out.println("\n option 1 you can pay " + (price / (days / 30)) + "sums during " + years + "years " + month + "month " + day + "days");
        System.out.println("\n option 2 you need to pay " + interest + "sums during " + days + " days");


    }
}
