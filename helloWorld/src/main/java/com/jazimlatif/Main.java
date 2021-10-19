package com.jazimlatif;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[] given = new String[]{"you","are","how","Hello"};
        String end = "";

        for (int i=given.length-1; i>= 0 ; i--) {
           end += given[i]+" ";


        }
        System.out.println(end);
    }
}

