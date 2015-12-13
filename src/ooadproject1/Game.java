/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;

import java.awt.*;
import java.awt.image.*;
import java.util.*;

/**
 *
 * @author Lenovo G50
 */
public abstract class Game extends PlayableGame{
    private String gameName;
    private String yearReleased;
    private String gameDescription;
    private BufferedImage boxArt;
    private int ageRating;
    private ChildRatings childRating;
    private ArrayList<Integer> playedChildIds;
    
    public void play(int childId)
    {
       if(!playedChildIds.contains(childId))
        {
            setPlayedChildId(childId, childId);
        }
    }
    public Boolean isAppAge()
    {
        if(ageRating > 18){
        return true;}
        else return false;
    }
    public abstract Boolean hasPlayed(int t);
    public String getGameName() {
        return gameName;
    }
    public BufferedImage getBoxArt()
    {
        return boxArt;
    }
    String getYearReleased() {
        return yearReleased;
    }
     int getAgeRating() {
        return ageRating;
    }
     public void setGameName(String name)
    {
        gameName = name;
    }
    public void setYearReleased(String yearReleased)
    {
        this.yearReleased = yearReleased;
    }
    public void setGameDescription(String desc)
    {
        gameDescription = desc;
    }
    public void setAgeRating(int ageRate)
    {
        ageRating = ageRate;
    }
    public void setBoxArt(BufferedImage bI)
    {
        boxArt = bI;
    }
    public void sumbitChildRating(float rating, int childId)
    {
        if(playedChildIds.contains(childId))
        {
            childRating.sumbitRating(rating);
        }
    }
    public void setPlayedChildId(int a, int b)
    {
        playedChildIds.set(a, b);
    }
}
