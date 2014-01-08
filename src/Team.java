/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RD Galang
 */
public class Team 
{
    private String name;
    private int score;
    private int currentRound;
    
    public Team(String name)
    {
        this.name = name;
        score = 0;
        currentRound = 1;
    }
    
    public void increaseScore()
    {
        score++;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCurrentROund()
    {
        return currentRound;
    }
}
