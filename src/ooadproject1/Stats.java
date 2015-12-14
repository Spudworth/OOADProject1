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
public class Stats {
    public float getAverage(float totaleRating, int numOfRatings)
    {
        float averageRating = totaleRating / numOfRatings;
        return averageRating;
    }
}
