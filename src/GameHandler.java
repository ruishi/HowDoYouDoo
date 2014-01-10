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
import java.io.IOException;
import java.util.HashSet;

import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;

import java.net.URL;
import java.net.MalformedURLException;

public class GameHandler {
    private Team team1;
    private Team team2;
    private int rounds;
    private ArrayList<String> songs;
    private Team currentTeam;
    private int roundCounter;
    private int[] scores = new int[2];
    
    public GameHandler(Team team1, Team team2, int rounds)
    {
        this.team1 = team1;
        this.team2 = team2;
        this.rounds = rounds;
        currentTeam = team1;
        roundCounter = 0;
        songs = populateSongList();
 
    }
    
    private ArrayList<String> populateSongList()
    {
        String url = "http://www1.billboard.com/rss/charts/hot-100";
        SongHandler handler = new SongHandler();
        try
        {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(handler);
            reader.parse(new InputSource(new URL(url).openStream()));
        } catch(SAXException | IOException e) {}
        
        ArrayList<String> songList = handler.getSongList();
        HashSet uniqueSongList = new HashSet();
        uniqueSongList.addAll(songList);
        songList.clear();
        songList.addAll(uniqueSongList);
        return songList;
    }
    
    public String nextSong()
    {
        Random rand = new Random();
        if (songs.isEmpty())
            return "No more songs";
        else
            return songs.remove(rand.nextInt(songs.size()));
    }
    
    public String nextSong(Boolean correct)
    {
        if (correct)
            currentTeam.increaseScore();
        Random rand = new Random();
        if (songs.isEmpty())
                return "No more songs";
        else
            return songs.remove(rand.nextInt(songs.size()));
    }
    
    public Team getCurrentTeam()
    {
        return currentTeam;
    }
    
    public void nextTeam()
    {
        if (currentTeam == team1)
            currentTeam = team2;
        else
            currentTeam = team1;
                
    }
    
    public void increaseRound()
    {
        roundCounter++;
    }
    
    public int[] getScores()
    {
        scores[0] = team1.getScore();
        scores[1] = team2.getScore();
        return scores;
    }
    
    public Boolean roundsLeft()
    {
        if (roundCounter < rounds * 2)
            return true;
        else
            return false;
    }
    
 }

