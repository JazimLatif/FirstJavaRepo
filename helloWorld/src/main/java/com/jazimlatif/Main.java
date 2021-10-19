package com.jazimlatif;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        String name = new String("Helena");
//        String name2 = "Helena";
//        String name3 = "Helena";
//        System.out.println(name.compareTo(name2));
//        System.out.println(name.equals(name2));
//        System.out.println(name == name3);
//        System.out.println(name2==name3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");

        String input = scanner.nextLine();
        System.out.println("Hello "+input);
    }
}

