package ua.hillelit.lms.homeWork;

public class HomeWorkApp {

  public static void main(String[] args) {

    System.out.println(findSymbolOccurance("qwertyqwq", 'q'));

    System.out.println(findWordPosition("Apollo", "pollo"));

    System.out.println(stringReverse("Hello"));

    System.out.println(isPalindrome("aErea"));

  }

  public static int findSymbolOccurance(String str, char symbol) {

    char[] charArr = str.toCharArray();
    int count = 0;

    for (char chars : charArr) {

      if (symbol == chars) {
        count++;
      }

    }
    return count;

  }

  public static int findWordPosition(String source, String target) {

    return source.indexOf(target);

  }

  public static String stringReverse(String str) {

    char[] charArr = str.toCharArray();
    int len = charArr.length - 1;
    StringBuilder reverseStr = new StringBuilder();

    for (int i = len; i >= 0; i--) {
      reverseStr.append(charArr[i]);
    }
    return reverseStr.toString();

  }

  public static boolean isPalindrome(String str) {

    str = str.toLowerCase();

    char[] charArr = str.toCharArray();

    int len = charArr.length;
    int leftIndex = 0;
    int rightIndex = len - 1;

    if (len % 2 == 0) {
      return false;
    }

    while (leftIndex < len / 2) {

      if (charArr[leftIndex++] != charArr[rightIndex--]) {
        return false;
      }

    }
    return true;

  }

}
