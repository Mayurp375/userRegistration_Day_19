package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class shouldHaveAtleastOneUpperCae {
    public void check(){
        System.out.println("enter password atlist on");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.\"\n" +
                " + \"*[A-Z])(?=.*\\\\d)\"\n" +
                " + \"(?=.*[-+_!@#$%^&*., ?]).+$");
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find());
    }



}
