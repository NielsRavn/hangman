/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author peter bærbar
 */
public class MockWordFile implements IWordFile {

    @Override
    public String getRandomWord() {
        return "horse";
    }
    
}
