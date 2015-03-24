/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Niels
 */
public class WordLogicTest {
    
    public WordLogicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testShowableWord() {
        String word = "secretword";
        String charGuess = "r";
        WordLogic wl = new WordLogic(word);
        wl.guess(charGuess);
        String result = wl.showableWord();
        assertEquals("___r____r_", result);
    }
    
    @Test
    public void testShowableWord2() {
        String word = "secretword";
        String charGuess = "r";
        String charGuess2 = "s";
        String charGuess3 = "d";
        WordLogic wl = new WordLogic(word);
        wl.guess(charGuess);
        wl.guess(charGuess2);
        wl.guess(charGuess3);
        String result = wl.showableWord();
        assertEquals("s__r____rd", result);
    }
    
    @Test
    public void testGuessIsFalse() {
        String word = "secretword";
        String charGuess = "b";
        WordLogic wl = new WordLogic(word);
        boolean result = wl.guess(charGuess);
        assertFalse(result);
    }
    
    @Test
    public void testGuessIsFalseLossOfLife() {
        String word = "secretword";
        String charGuess = "b";
        WordLogic wl = new WordLogic(word);
        wl.guess(charGuess);
        int result = wl.getLifes();
        assertEquals(6, result);
    }
    
    @Test
    public void testGuessIsTrue() {
        String word = "secretword";
        String charGuess = "r";
        WordLogic wl = new WordLogic(word);
        boolean result = wl.guess(charGuess);
        assertTrue(result); 
    }
    
    @Test
    public void testGuessIsTrueNoLossOfLife () {
        String word = "secretword";
        String charGuess = "r";
        WordLogic wl = new WordLogic(word);
        wl.guess(charGuess);
        int result = wl.getLifes();
        assertEquals(7, result);
    }
    
    @Test 
    public void testIsWinner(){
        String word = "sec";
        WordLogic wl = new WordLogic(word);
        wl.guess("s");
        wl.guess("e");
        wl.guess("c");
        assertTrue(wl.isWin());

        WordLogic nwl = new WordLogic(word);
        nwl.guess("s");
        nwl.guess("c");
        assertFalse(nwl.isWin());
    }
    
    @Test(expected = NullPointerException.class)
    public void ExpectedExceptionIsWinner(){
        String word = null;
        WordLogic wl = new WordLogic(word);
        wl.guess("s");
        wl.guess("e");
        wl.guess("c");
        assertTrue(wl.isWin());  
    }
    
     @Test
     public void testGetGuessesSingleChars(){
        String word = "secretword";
        WordLogic wl = new WordLogic(word);
        wl.guess("s");
        wl.guess("u");
        
        assertEquals("s", wl.getGuesses().get(0));
        assertEquals("u", wl.getGuesses().get(1));
     }
     
     @Test
     public void testGetGuessesFullWord(){
        String word = "secretword";
        WordLogic wl = new WordLogic(word);
        wl.guess("secretwird");
        wl.guess("secretwurd");
        
        assertEquals("secretwird", wl.getGuesses().get(0));
        assertEquals("secretwurd", wl.getGuesses().get(1));
     }
     
     @Test(expected = NullPointerException.class)
     public void testExpectedExceptionGetGuesses(){
        String word = null;
        WordLogic wl = new WordLogic(word);
        wl.guess(null);
        wl.guess("e");
        wl.guess("c");
        assertEquals(null, wl.getGuesses().get(0));
        assertEquals("e", wl.getGuesses().get(1));
        assertEquals("c", wl.getGuesses().get(2));
     }
}
