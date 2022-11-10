package org.example;

import javafx.scene.shape.PathElement;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_ID {
    public email_ID() {
        /*
        user email adres
        all small [a-z]
        [@,.]
         */

        System.out.println("enter email address with [a-z][@,.] " +
                "ie.mau@gmail.com");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern pattern = Pattern.compile("[a-z][@,.]");
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.find());
    }
}
