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
    
    
    
    
    
    
    
    
    
    
}
