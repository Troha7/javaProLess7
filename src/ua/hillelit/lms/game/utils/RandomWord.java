package ua.hillelit.lms.game.utils;

public class RandomWord {

  private final String[] words;

  public RandomWord(String[] words) {
    this.words = words;
  }

  public String getRandomWord() {

    int index = (int) (Math.random() * (words.length - 1));
    return words[index];

  }

  public void printAllWords() {

    for (String word : words) {
      System.out.println(word);
    }

  }

}
