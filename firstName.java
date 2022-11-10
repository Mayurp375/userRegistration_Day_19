package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstName {
    public firstName() {
        /*
         *User input
         * Sting name
         *

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter firstName as [A-Z][a-z] ");

        String name = scanner.next();
        Pattern patern = Pattern.compile("^[A-Z][a-z]{4,}");
        Matcher matcher = patern.matcher(name);
        System.out.println(matcher.matches());
    }
}
