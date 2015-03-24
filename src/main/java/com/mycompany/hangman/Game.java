/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hangman;

import BLL.WordLogic;
import DAL.WordFile;
import java.util.Scanner;

public class Game {
        
    WordLogic wl;
    Scanner sc;
    
    public Game(){
       sc = new Scanner(System.in);
    }
    
    public void startNewGame(){
        printIntroduction();
        wl = new WordLogic(new WordFile());
        
        while(wl.getLifes()>0 && !wl.isWin()){
            printProgress();
            String guess = makeGuess();
            wl.guess(guess);
        }
        if(!wl.isWin()){
            printHangman(0);
            System.out.println("YOU LOSE!!!");
        }
        else{
            printHangman(wl.getLifes());
            System.out.println("CONGRATULATIONS YOU WON!!!!!!");
        }
        System.out.println("The word was: " + wl.getSecretWord());
        System.out.println("The meaning of the word is: " + wl.getWordDescription());
        System.out.print("Retry? (y/n):");
        String answer = sc.next();
        if(answer.equalsIgnoreCase("y")) startNewGame();
    }
    
    
    public String makeGuess(){
        System.out.println("Your guess: ");
        String guess = sc.next();
        return guess;
    }
    
    private void printIntroduction(){
        System.out.println("Hi!");
        System.out.println("Welcome to Hangman.");
        System.out.println("The rules are simple:");
        System.out.println("You have to guess the secret word. Either a letter or the full word.");
        System.out.println("You have a total of 7 lives before the game ends.");
        System.out.println("Good Luck!");
    }
    
   private void printProgress(){
       printHangman(wl.getLifes());
       printGuesses();
       System.out.println(wl.showableWord());
   }
   
   private void printGuesses(){
       System.out.print("Guesses: ");
       for(String s : wl.getGuesses())
            System.out.print(s);
       System.out.println("");
   }
   
    private void printHangman(int life) {
        switch (life) {
            case 7:
                System.out.println("_________  ");
                System.out.println("|/         ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 6:
                System.out.println("_________ ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 5:
                System.out.println("_________  ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|       |  ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 4:
                System.out.println("_________  ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|       |/");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 3:
                System.out.println("_________  ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|      \\|/");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 2:
                System.out.println("_________  ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|      \\|/");
                System.out.println("|       |  ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 1:
                System.out.println("_________  ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|      \\|/");
                System.out.println("|       |  ");
                System.out.println("|      /   ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 0:
                System.out.println(" ___________.._______ ");
                System.out.println("| .__________))______|");
                System.out.println("| | / /      ||");
                System.out.println("| |/ /       ||");
                System.out.println("| | /        ||.-''.");
                System.out.println("| |/         |/  _  \\");
                System.out.println("| |          ||  `/,|");
                System.out.println("| |          (\\\\`_.'");
                System.out.println("| |         .-`--'.");
                System.out.println("| |        /Y . . Y\\");
                System.out.println("| |       // |   | \\\\");
                System.out.println("| |      //  | . |  \\\\");
                System.out.println("| |     ')   |   |   (`");
                System.out.println("| |          ||'||");
                System.out.println("| |          || ||");
                System.out.println("| |          || ||");
                System.out.println("| |          || ||");
                System.out.println("| |         / | | \\");
                System.out.println("\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|");
                System.out.println("|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|");
                System.out.println("| |        \\ \\        | |");
                System.out.println(": :         \\ \\       : : ");
                System.out.println(". .          `'       . .");
                break;
        }

    }

}
