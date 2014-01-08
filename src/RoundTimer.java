/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RD Galang
 */

import java.util.TimerTask;
        
public class RoundTimer extends TimerTask {
    HowDoYouDooUI gameUI;
    GameHandler game;
    
    public RoundTimer(HowDoYouDooUI gameUI, GameHandler game)
    {
        this.gameUI = gameUI;
        this.game = game;
    }
    
    @Override
    public void run()
    {
        game.increaseRound();
        gameUI.roundResults();
    }
}
