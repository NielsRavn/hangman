/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.ArrayList;
import DAL.WordFile;
import java.io.IOException;


/**
 *
 * @author Niels
 */
public class WordLogic {

    private String secretWord;
    private ArrayList<String> guesses;
    private StringBuilder showableWord;
    private int lives = 7;

    public WordLogic(String secretword) {
        secretWord = secretword;
        guesses = new ArrayList<>();
        showableWord = new StringBuilder();
    }

    public boolean guess(String wordGuess) {
        guesses.add(wordGuess);
        for(Character c : secretWord.toCharArray()){
            if(c.toString().equals(wordGuess)){
                return true;
            }
        }
        lives--;
        return false;
    }
    
    public int getLifes() {
        return lives;
    }
   
    public String getRandomWord(){
        WordFile wf = new WordFile();
        try {
            return wf.getRandomWord();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String showableWord() {
        for(Character c : secretWord.toCharArray()) {
            for (String s : guesses) {
                if(s.equals(c.toString())) {
                    showableWord.append(s);
                } else {
                    showableWord.append("_");
                }
            }
        }
        return showableWord.toString();
    }
}
