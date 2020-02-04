package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input email : ");
        String input = sc. nextLine();

        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            System.out.println("OK");
        }
        else {
            System.out.println("Not OK");
        }
    }
}
