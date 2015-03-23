/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.WordFile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Niels
 */
public class WordLogic {
   
    public String getRandomWord(){
        WordFile wf = new WordFile();
        try {
            return wf.getRandomWord();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
