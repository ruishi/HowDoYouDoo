/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RD Galang
 */

import java.util.ArrayList;
import java.util.Random;

public class GameHandler {
    private Team team1;
    private Team team2;
    private int rounds;
    private ArrayList<String> songs;
    
    public GameHandler(Team team1, Team team2, int rounds)
    {
        this.team1 = team1;
        this.team2 = team2;
        this.rounds = rounds;
    }
    
    public String nextSong(Team team, Boolean correct)
    {
        if (correct)
            team.increaseScore();
        Random rand = new Random();
        return songs.remove(rand.nextInt(songs.size()));
    }
    
    public void startGame()
    {
    }
}
