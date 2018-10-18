/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package win;

/**
 *
 * @author karpa
 */
public class Player {
    private int player1, player2;
    
    public Player(int player1, int player2)
    {
        player1 = this.player1;
        player2 = this.player2;
    }
    
    public void setZeroScore()
    {
        Score s = new Score(0, 0);
    }
    
    public String winner()
    { 
        Score s;
        s = new Score(0, 0);
        if (s.getScore1() > s.getScore2())
            return "Player 1 wins";
        else if (s.getScore1() < s.getScore2())
            return "Player 2 wins";
        return "tie";    
    }
}
