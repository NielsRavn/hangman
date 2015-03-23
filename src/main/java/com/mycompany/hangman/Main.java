/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hangman;

import BLL.WordLogic;

/**
 *
 * @author Niels
 */
public class Main {
    
    public static void main(String[] args){
        WordLogic l = new WordLogic();
        l.checkChar("heje", 'e');
    }
    
}
