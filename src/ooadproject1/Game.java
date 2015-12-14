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
public abstract class Game {
    private String gameName;
    private String yearReleased;
    private String gameDescription;
    private BufferedImage boxArt;
    private int ageRating;
    private ChildRatings childRating;
    private ArrayList<String> childComments;
    private ArrayList<Integer> playedChildIds;
    
    public void play(int childId)
    {
       if(!playedChildIds.contains(childId))
        {
            setPlayedChildId(childId, childId);
        }
    }
    public Boolean isAppropriateAge()
    {
        if(ageRating > 18){
        return true;}
        else return false;
    }
    public Boolean hasPlayed(int childId){
        if(playedChildIds.contains(childId)){
            return true;
        }
        else 
            return false;    
    };
    
    /*public String getChildComment(int childId){
        if(playedChildIds.contains(childId)){
            return comment;
        }
    }*/
    
    public String getGameName() {
        return gameName;
    }
    
    public String getYearReleased() {
        return yearReleased;
    }
    
    public String getGameDescription(){
        return gameDescription;
    }
    
    public BufferedImage getBoxArt()
    {
        return boxArt;
    }
    
    public int getAgeRating() {
        return ageRating;
    }
     
    public float getChildRatingAverage(){
        childRating = new ChildRatings();
        
        float average = childRating.totalRating / childRating.numOfRatings;
        
        return average;
    }
     public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }
    public void setYearReleased(String yearReleased)
    {
        this.yearReleased = yearReleased;
    }
    public void setGameDescription(String gameDesc)
    {
        gameDescription = gameDesc;
    }
    public void setAgeRating(int ageRate)
    {
        ageRating = ageRate;
    }
    public void setBoxArt(BufferedImage boxArt)
    {
        this.boxArt = boxArt;
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
    
    public void setChildComment(String comment){
        
        childComments = new ArrayList();
        
        childComments.add(comment);
    }
}
