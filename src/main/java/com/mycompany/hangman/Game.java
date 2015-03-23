/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hangman;

public class Game {

    public void printHangman(int life) {
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
