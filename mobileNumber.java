package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobileNumber {
    public mobileNumber() {
        /*
         * pre defined format
         * space with contry code
         * */

        String mobNumber = "+91 7507811344";
        Pattern pattern = Pattern.compile("[+91][0-9]");
        Matcher matcher = pattern.matcher(mobNumber);
        System.out.println(matcher.find());
    }


}

