/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hangman;

import BLL.WordLogic;
import java.util.Scanner;

public class Game {

    WordLogic wl;
    
    public Game(){
       
    }
    
    public void startNewGame(){
        printIntroduction();
    }
    
    public void makeGuess(){
        System.out.println("stuff");
        Scanner sc = new Scanner(System.in);
        String guess = sc.next();
        
    }
    
    private void printIntroduction(){
        System.out.println("Hi!");
        System.out.println("Welcome to Hangman.");
        System.out.println("The rules are simple:");
        System.out.println("You have to guess the secret word. Either a letter or the full word.");
        System.out.println("You have a total of 7 lives before the game ends.");
        System.out.println("Good Luck!");
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
                System.out.println("|       |  ");
                System.out.println("|          ");
                System.out.println("|          ");
                System.out.println("|___       ");
                break;
            case 3:
                System.out.println("_________  ");
                System.out.println("|/      |  ");
                System.out.println("|      (_) ");
                System.out.println("|      \\|/");
                System.out.println("|       |  ");
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
