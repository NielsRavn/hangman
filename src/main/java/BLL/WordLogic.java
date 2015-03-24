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

    public WordLogic(){
        secretWord = getRandomWord();
        guesses = new ArrayList<>();
    }
    public WordLogic(String secretword) {
        secretWord = secretword;
        guesses = new ArrayList<>();
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
    
    public boolean isWin(){
        return !showableWord().contains("_");
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
    
    //Virker ikke når der er mere end 1 entry i guess array. Test nr. 2 fejler.
    public String showableWord() {
        showableWord = new StringBuilder();
        for(Character c : secretWord.toCharArray()) {
            boolean found = false;
            for (String s : guesses) {
                if(s.equals(c.toString())) {
                    showableWord.append(s);
                    found = true;
                    break;
                }
            }
            if(!found){
                showableWord.append("_");
            }
        }
        return showableWord.toString();
    }
    
}
