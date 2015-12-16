/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;


public class ChildRatings extends UserRatings{
    public float totalRating;
    private float minRating;
    private float maxRating;
    public ChildRatings(){
        minRating = 0.0f;
        maxRating = 100.0f;
        rating =0;
    }
    

    public void sumbitRating(float rate) 
    {
        setNumOfRatings(getNumOfRatings()+1);
        totalRating += rate;
        rating = myStats.getAverage(totalRating, getNumOfRatings());
    }
    
    
    @Override
    public void setRating(float rating) 
    {
        totalRating = rating; 
    }
    
    
    public void addToTotalRating(float totalRating)
    {
        this.totalRating = totalRating;
    }
    
    public float getMinRating()
    {
        return minRating;
    }
    public float getMaxRating()
    {
        return maxRating;
    }
    
    @Override
    public float getRating() 
    {
        return rating;   
    }
}
