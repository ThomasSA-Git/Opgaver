package com.company;

import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public void testNavn() {
    System.out.println("Hvad er dit navn?");
    String navn = sc.next();
    System.out.println("Hej " + navn);
  }

  public void askAboutAge() {
    System.out.println("Hvor gammel er du?");
    int alder = sc.nextInt();
    System.out.println(alder);
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.testNavn();
    obj.askAboutAge();
    System.out.println("It works");
  }
}
