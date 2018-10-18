package win;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author villa
 */
public class ScoreTest {
    static int score1, score2;
    
    public ScoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        score1 = 12;
        score2 = 12;
                
    }
    
    @Test
    public void hasMatch() {
        assertEquals("tie", firstMatch(score1, score2));
    }
    

// Returns index of first position where the corresponding
// elements are the same. If there are no matches, return
// the length of the first list.
//   You may assume the lists are of
// the same length. The search is case-sensitive.
    public static String firstMatch(int score1, int score2) 
    {
        if (score1 > score2)
            return "Player 1 wins";
        if (score2 < score1)
            return "Player 2 wins";
        return "tie";
    }
}