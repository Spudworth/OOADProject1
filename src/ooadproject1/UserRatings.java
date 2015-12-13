/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;

/**
 *
 * @author Lenovo G50
 */
public abstract class UserRatings {
    float rating;
    float totalRating;
    Stats myStats;
    int noOfRatings;
    String ratings;

    public void sumbitRating(float rate){
        setNoOfRatings(getNoOfRatings()+1);
        totalRating += rate;
        rating = myStats.getAverage(totalRating, getNoOfRatings());
    }
    public void submitRating(String rates){
        ratings = rates;
    }
    public void setRating(float rater)
    {
        rating = rater;
    }
    public void setNoOfRatings(int noRate)
    {
        noOfRatings = noRate;
    }
    public void addToTotalRating(float tR)
    {
        totalRating = tR;
    }
    public float getRating()
    {
        return rating;
    }
    public int getNoOfRatings()
    {
        return noOfRatings;
    }
}
