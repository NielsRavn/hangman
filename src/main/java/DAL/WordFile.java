/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Niels
 */
public class WordFile {
    
    private final String FILE_PATH = "res/words.txt";

    
    public String getRandomWord() throws FileNotFoundException, IOException{
        ArrayList<String> words = new ArrayList();
        
        BufferedReader r = new BufferedReader(new FileReader(new File(FILE_PATH)));
        String line = null;
        while((line = r.readLine()) != null){
            words.add(line);
        }
        return words.get((int)(Math.random() * (words.size()-1)));
    }
    
}
