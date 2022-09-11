package ua.hillelit.lms.game.controller;

import ua.hillelit.lms.game.model.GameModel;
import ua.hillelit.lms.game.utils.RandomWord;
import ua.hillelit.lms.game.utils.Validator;

import java.util.Scanner;

public class GameControl {

  RandomWord word;


  public GameControl(RandomWord word) {
    this.word = word;
  }

  public void run() {

    Scanner scanner = new Scanner(System.in);
    String secretWord = word.getRandomWord();

    System.out.println("[Guess the fruit or veggie name]");
    word.printAllWords();
    System.out.println("Enter the name: ");

    while (!GameModel.isGuessWord(secretWord, Validator.validateWord(scanner))) {

      System.out.println("Name is not guessed!\nPlease try agan!");
      System.out.println("Enter the name: ");

    }
    System.out.println("GAME OVER");

  }

}
