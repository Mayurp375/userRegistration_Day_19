package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastName {
    public lastName() {
        /*
        valid last name
        start Capital
        min 3 char
         */
        System.out.println("enter last name as [A-Z][a-z]");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.next();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(lastName);
        System.out.println(matcher.matches());
    }
}
