/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package win;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karpa
 */
public class InitialScoreTest {
    
    public InitialScoreTest() {
    }
    
    static int score1, score2;
    
    @BeforeClass
    public static void setUpClass() {
        score1 = 0;
        score2 = 0;
                
    }
    
    @Test
    public void hasMatch() {
        assertEquals(true, isZero(score1, score2));
    }
    

// Returns index of first position where the corresponding
// elements are the same. If there are no matches, return
// the length of the first list.
//   You may assume the lists are of
// the same length. The search is case-sensitive.
    public static boolean isZero(int score1, int score2) 
    {
        if (score1 == 0 && score2 == 0)
            return true;
        return false;
    }
}
