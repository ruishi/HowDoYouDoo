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
    private Team currentTeam;
    
    public GameHandler(Team team1, Team team2, int rounds)
    {
        this.team1 = team1;
        this.team2 = team2;
        this.rounds = rounds;
        currentTeam = team1;
        songs = new ArrayList<>();
        songs.add("Girl on Fire");
        songs.add("Get Lucky");
        songs.add("Walking on Sunshine");
        songs.add("Roar") ;
        songs.add("Canadian Bacon");
    }
    
    public String nextSong()
    {
        Random rand = new Random();
        return songs.remove(rand.nextInt(songs.size()));
    }
    
    public String nextSong(Boolean correct)
    {
        if (correct)
            currentTeam.increaseScore();
        Random rand = new Random();
        return songs.remove(rand.nextInt(songs.size()));
    }
    
    public Team getCurrentTeam()
    {
        return currentTeam;
    }
    
    public void startGame()
    {
        
    }
    
 }

