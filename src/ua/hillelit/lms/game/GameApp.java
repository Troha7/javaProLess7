package ua.hillelit.lms.game;

import ua.hillelit.lms.game.controller.GameControl;
import ua.hillelit.lms.game.utils.RandomWord;

public class GameApp {

  public static void main(String[] args) {

    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
        "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    GameControl game = new GameControl(new RandomWord(words));
    game.run();

  }
}
