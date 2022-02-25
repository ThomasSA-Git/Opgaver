package com.company;

import java.util.Scanner;

public class Main {

    public void testNavn(){
        System.out.println("Hvad er dit navn?");
        Scanner sc = new Scanner(System.in);
        String navn = sc.next();
        System.out.println("Hej " + navn);

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.testNavn();
        System.out.println("It works");    }
}
