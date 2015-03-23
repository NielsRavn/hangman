/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author Niels
 */
public class WordLogic {
    private StringBuilder secretWord;
    
    
    public void initSecretWord(String word){
        secretWord = new StringBuilder(word);
    }
    public void checkChar(char search){
        if(secretWord == null)
            return;
        for(int i=0;i<secretWord.length();i++) {
            if(secretWord.charAt(i)== search){
                replaceSecretWord(search, i);
            }
        }
    }
    
    private void replaceSecretWord(char search, int position){
        secretWord.setCharAt(position, search);
    }
    
    
    public String getShowableWord(){
        return null;
    }
    
}
