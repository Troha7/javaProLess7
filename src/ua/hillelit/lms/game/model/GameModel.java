package ua.hillelit.lms.game.model;

public class GameModel {

  public static boolean isGuessWord(String randomWord, String word) {

    StringBuilder str = new StringBuilder("###############");

    if (randomWord.equals(word)) {
      System.out.println("YOU WIN!\n" + "Secret word: [" + word + "]");
      return true;
    }

    for (int i = 0; (i < word.length()) && (i < randomWord.length()); i++) {

      if (word.charAt(i) == randomWord.charAt(i)) {
        str.setCharAt(i, word.charAt(i));
      }

    }

    System.out.println("Guessed characters:");
    System.out.println("[" + str + "]");

    return false;
  }

}
