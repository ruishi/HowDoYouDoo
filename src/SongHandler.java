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

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SongHandler extends DefaultHandler {
    private ArrayList<String> songs = null;
    String song;
    boolean title;
    
    public ArrayList<String> getSongList()
    {
        return songs;
    }
    
    @Override
    public void startElement(String uri, String localname, String qName, Attributes attributes) throws SAXException
    {
        if (qName.equalsIgnoreCase("title"))
        {
            title = true;
            if (songs == null)
                songs = new ArrayList<>();
        }
    }
    
    @Override
    public void endElement(String uri, String localname, String qName) throws SAXException
    {
        songs.add(song);
    }
    
    @Override
    public void characters(char ch[], int start, int length) throws SAXException
    {
        if (title)
        {
            if (!(new String(ch, start, length).matches("Billboard Hot 100 Chart")))
            {
                String[] songArtist = (new String(ch, start, length)).split(",");
                song = "<html>" + songArtist[0] + "<br>" + songArtist[1] + "<html>";
            } 
            title = false;
        }
    }
    
    
}
