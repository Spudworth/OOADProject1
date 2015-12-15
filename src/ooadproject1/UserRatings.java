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
    float rating;
    Stats myStats;
    int numOfRatings;
    TreeMap comments = new TreeMap();

    public void setComment(int userId, String comment){
        comments.put(userId, comment);
    }
   
    public void setNumOfRatings(int numOfRatings)
    {
        this.numOfRatings = numOfRatings;
    }
    
    public abstract float getRating();
    
    public int getNumOfRatings()
    {
        return numOfRatings;
    }
    public String getComment(int userId){
        return (String)comments.get(userId);
    }
}
