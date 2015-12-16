/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;
import java.util.*;
/**
 *
 * @author Lenovo G50
 */
public abstract class UserRatings {
    protected float rating;
    protected Stats myStats = new Stats();
    private int numOfRatings;
    private TreeMap comments = new TreeMap();

    public void setComment(int userId, String comment){
        comments.put(userId, comment);
    }
   
    public void setNumOfRatings(int numOfRatings)
    {
        this.numOfRatings = numOfRatings;
    }
    public abstract void setRating(float rating);
    public abstract float getRating();
    
    public int getNumOfRatings()
    {
        return numOfRatings;
    }
    public String getComment(int userId){
        return (String)comments.get(userId);
    }
}
