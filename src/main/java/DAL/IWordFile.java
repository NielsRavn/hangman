/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author peter bærbar
 */
public interface IWordFile {
    String getRandomWord() throws FileNotFoundException, IOException;
}
