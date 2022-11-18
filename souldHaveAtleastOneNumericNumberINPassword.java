package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class souldHaveAtleastOneNumericNumberINPassword {
    public void Check(){
        System.out.println("enter password atlist on");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        Pattern pattern = Pattern.compile("^[0-9A-Za-z][@,.]{8,}$");
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find());
    }
}
