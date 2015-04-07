/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.IWordFile;
import DAL.ReadJson;
import java.util.ArrayList;
import DAL.WordFile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Niels
 */
public class WordLogic {

    private String secretWord;
    private ArrayList<String> guesses;
    private StringBuilder showableWord;
    private int lives = 7;
    IWordFile m_wordFile;
    


    public WordLogic(IWordFile m_wordFile){
        this.m_wordFile = m_wordFile;
        secretWord = getRandomWord();
        guesses = new ArrayList<>();
        
    }
    public WordLogic(String secretword) {
        secretWord = secretword;
        guesses = new ArrayList<>();
    }

    public boolean guess(String wordGuess) {
        if(wordGuess.toLowerCase().equals(secretWord.toLowerCase())){
            for(char c : wordGuess.toCharArray()){
                guesses.add(c+"");
            }
            return true;
        }
        
        guesses.add(wordGuess);
        for(Character c : secretWord.toCharArray()){
            if(c.toString().equals(wordGuess)){
                return true;
            }
        }
        lives--;
        return false;
    }
    
    public String getWordDescription(){
        try {
            return ReadJson.getDescriptionFromWiki(secretWord);
        } catch (IOException ex) {
        }
        return "";
    }
    
    public String getSecretWord(){
        return secretWord;
    }
    
    public int getLifes() {
        return lives;
    }
    public boolean isWin(){
        return !showableWord().contains("_");
    }
    public ArrayList<String> getGuesses(){
        return guesses;
    }
   
    public String getRandomWord(){
        //WordFile wf = new WordFile();
        
        try {
            return m_wordFile.getRandomWord();
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
