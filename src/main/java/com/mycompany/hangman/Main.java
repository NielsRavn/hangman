/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hangman;


import BLL.WordLogic;
import DAL.WordFile;
import java.io.IOException;


/**
 *
 * @author Niels
 */
public class Main {
    

    public static void main(String[] args) throws IOException{
        WordFile words = new WordFile();
        for(int i = 0; i <100; i++){
            long start = System.currentTimeMillis();
            String word = words.getRandomWord();
            long time = System.currentTimeMillis() -start;
            System.out.println(""+ word + ": " + time);
        }
    }
    

}

