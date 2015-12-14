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
    int numOfRatings;
    String comment;

    public void sumbitRating(float rate){
        setNumOfRatings(getNumOfRatings()+1);
        totalRating += rate;
        rating = myStats.getAverage(totalRating, getNumOfRatings());
    }
    public void submitRating(String ratingComment){
        comment = ratingComment;
    }
    public void setRating(float rating)
    {
        this.rating = rating;
    }
    public void setNumOfRatings(int numOfRatings)
    {
        this.numOfRatings = numOfRatings;
    }
    public void addToTotalRating(float totalRating)
    {
        this.totalRating = totalRating;
    }
    public float getRating()
    {
        return rating;
    }
    public int getNumOfRatings()
    {
        return numOfRatings;
    }
    public String getComment(){
        return comment;
    }
}
