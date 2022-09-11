package ua.hillelit.lms.game.utils;

import java.util.Scanner;

public class Validator {

  public static String validateWord(Scanner scanner) {

    String str = scanner.nextLine().trim().toLowerCase();

    while (str.isEmpty()) {

      System.out.println("Empty! Please enter the name: ");
      str = scanner.nextLine().trim().toLowerCase();

    }
    return str;

  }

}
