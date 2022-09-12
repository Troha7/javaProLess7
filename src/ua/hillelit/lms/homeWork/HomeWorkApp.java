package ua.hillelit.lms.homeWork;

public class HomeWorkApp {

  public static void main(String[] args) {

    System.out.println("Symbol Occurance = " + findSymbolOccurance(null, 'q'));

    System.out.println("Word Position = " + findWordPosition("Apollo", null));

    System.out.println("Reverse word: " + stringReverse("Hello"));

    System.out.println("Is Palindrome: " + isPalindrome("eRE"));

  }

  public static int findSymbolOccurance(String str, char symbol) {

    int count = 0;

    if (str == null) {
      System.out.println("[Warning! \"String str == null\"]");
      return count;
    }

    char[] charArr = str.toCharArray();

    for (char chars : charArr) {

      if (symbol == chars) {
        count++;
      }

    }
    return count;

  }

  public static int findWordPosition(String source, String target) {

    if (source == null || target == null) {
      System.out.println("[Warning! \"String source == null or target == null\"]");
      return -1;
    }

    return source.indexOf(target);

  }

  public static String stringReverse(String str) {

    if (str == null) {
      return "[Warning! \"String str == null\"]";
    }

    StringBuilder newStr = new StringBuilder(str);

    return newStr.reverse().toString();

  }

  public static boolean isPalindrome(String str) {

    if (str == null) {
      System.out.println("[Warning! \"String str == null\"]");
      return false;
    }

    str = str.toLowerCase();
    String strReverse = stringReverse(str);

    return str.equals(strReverse);

  }

}
