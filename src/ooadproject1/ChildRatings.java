/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;


public class ChildRatings extends UserRatings{
    public float totalRating;
    
    public ChildRatings(){
        
    }
    

    public void sumbitRating(float rate) 
    {
        setNumOfRatings(getNumOfRatings()+1);
        totalRating += rate;
        rating = myStats.getAverage(totalRating, getNumOfRatings());
    }
    
    
    public void setRating(float rating) 
    {
        totalRating = rating; 
    }
    
    
    public void addToTotalRating(float totalRating)
    {
        this.totalRating = totalRating;
    }
    
    
    @Override
    public float getRating() 
    {
        return rating;   
    }
}
