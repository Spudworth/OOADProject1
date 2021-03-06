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
public class Game {
    private String gameName;
    private String yearReleased;
    private String gameDescription;
    
    private int ageRating;
    private ParentRatings parentRating;
    private ChildRatings childRating;
    private ArrayList<Integer> playedChildIds;
    private ArrayList<Integer> ratedChildIds;
    private float minParentalApp = 80.0f;
    
    public Game() 
    {
        gameName = "Name not available";
        yearReleased = "Date not available";
        gameDescription = "Description not available";
        ageRating = 0; 
        childRating = new ChildRatings();
        parentRating = new ParentRatings();
        playedChildIds = new ArrayList<Integer>();
        ratedChildIds = new ArrayList<Integer>();
    }
    
    
    public Game(String gameName, String yearReleased, String gameDescription, int ageRating) 
    {
        this.gameName = gameName;
        this.yearReleased = yearReleased;
        this.gameDescription = gameDescription;
        this.ageRating = ageRating;
        childRating = new ChildRatings();
        parentRating = new ParentRatings();
        playedChildIds = new ArrayList<Integer>();
        ratedChildIds = new ArrayList<Integer>();
    }
    
    
    public void play(int childId)
    {
       if(!playedChildIds.contains(childId))
        {
            setPlayedChildId(childId, childId);
        }
    }
    
    public boolean hasPartentalApproval(){
        if(parentRating.getRating() < minParentalApp){
            return false;
        }
        else
            return true;
    }
    public Boolean isAppropriateAge( int age)
    {
        if(ageRating > ageRating){
        return true;}
        else return false;
    }
    
    
    public Boolean hasPlayed(int childId)
    {
        if(playedChildIds.contains(childId)){
            return true;
        }
        else 
            return false;    
    };
    
    public boolean isValidRating(float newRating)
    {
        if (newRating < childRating.getMaxRating() && newRating > childRating.getMinRating())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public String getChildComment(int childId){
       return childRating.getComment(childId);
        
    }
    
     public String getParentComment(int parentId){
       return parentRating.getComment(parentId);
        
    }
    
    public String getGameName() 
    {
        return gameName;
    }
    
    
    public String getYearReleased() 
    {
        return yearReleased;
    }
    
    
    public String getGameDescription()
    {
        return gameDescription;
    }

    public int getAgeRating() 
    {
        return ageRating;
    }
     
    
    public float getChildRatingAverage()
    {
        return childRating.getRating();
    }
    
    public  int getPlayedChildId(int index){
        return playedChildIds.get(index);
    }
    public boolean hasChildRatedGame(int childId){
        if(ratedChildIds.contains(childId)){
            return true;
        }
        else
            return false;
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
    

    
    public void sumbitChildRating(float rating, int childId)
    {
        if(playedChildIds.contains(childId))
        {
            ratedChildIds.add(childId);
            childRating.sumbitRating(rating);
        }
    }
    
    public void submitParentRating(boolean rating, int parentId){
        parentRating.sumbitRating(parentId, rating);
    }
    
    public void setPlayedChildId(int a, int b)
    {
        playedChildIds.set(a, b);
    }
    
    public void setChildComment(int childId, String comment){
        
        childRating.setComment(childId, comment);
    }
    
    public void setParentComment(int parentId, String comment){
        
        parentRating.setComment(parentId, comment);
    }
    
    public void setRatedChild(int childId){
        ratedChildIds.add(childId);
    }

}
