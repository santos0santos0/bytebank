package com.santos0santos0.bytebank.bank.test;

public class TestString {

    public static void main(String[] args) {

        String company = "Intruder";

        System.out.println(company.contains("Intru"));

        // String empty = "";

        // System.out.println(empty.isBlank());

        // String trim = empty.trim();

        // System.out.println(empty.isEmpty());

        String name = "OffSec";

        System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // String sub = name.substring(3);
        // System.out.println(sub);

        // int position = name.indexOf("Sec");
        // System.out.println(position);

        // char a = name.charAt(2);
        // System.out.println(a);

        // char e = 'c';
        // char c = 'C';

        // String upperName = name.toUpperCase();
        // String lowerName = name.toLowerCase();
        // String replaceName = name.replace(e, c);

        // System.out.println(name);
        // System.out.println("UpperCase >>> " + upperName);
        // System.out.println("LowerCase >>> " + lowerName);
        // System.out.println("Replace >>> " + replaceName);

    }

}
