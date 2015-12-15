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
public class Stats {
    public float getAverage(float totaleRating, int numOfRatings)
    {
        float averageRating = totaleRating / numOfRatings;
        return averageRating;
    }
    
    public float getPercentageTrue(int numOfRatings, ArrayList<Boolean> approvals){
        
        int numTrue =0;
        
        for(int i = 0; i < numOfRatings; i++){
            if(approvals.get(i)){
                numTrue ++;
            }
        }
        float percentage = numTrue/numOfRatings * 100;
        return percentage;
    }
}
