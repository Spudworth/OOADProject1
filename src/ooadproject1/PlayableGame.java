/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;

import java.awt.*;
import java.awt.image.*;

/**
 *
 * @author Lenovo G50
 */
public class PlayableGame extends Game{
    private String gameName;
    private String yearReleased;
    private String gameDescription;
    private BufferedImage boxArt;
    private int ageRating;
    
    
    public PlayableGame(){
       gameName = "N/A";
       yearReleased = "Unknown";
       gameDescription = "No Description Available";
       boxArt = null;
       ageRating = 0;
    }
    
    public PlayableGame(String gameName, String yearRealeased,String gameDescription,BufferedImage boxart, int ageRating){
        this.gameName = gameName;
        this.yearReleased = yearRealeased;
        this.gameDescription = gameDescription;
        this.boxArt = boxart;
        this.ageRating = ageRating;
        
        
    }
}
