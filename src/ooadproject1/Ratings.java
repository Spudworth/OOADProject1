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
public interface Ratings {
     public void setRatings(float f);
    public void setNoRatings(int i);
    public int getNoRating();
    public float getRating();
    public void addToTotalRating(float f);
}
