/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;
import java.util.*;
/**
 *
 * @author mrlyo
 */
public class ParentRatings extends UserRatings {
    TreeMap approval = new TreeMap(); 
   

    public void sumbitRating(int parentId, boolean isApproved) 
    {
        approval.put(parentId, isApproved);
    }
    
    public boolean isApproved(int parentId){
        return (boolean)approval.get(parentId);
    }
    public ArrayList asArrayList(){
        ArrayList<Boolean> approvalList = new ArrayList(approval.values());
        
        return approvalList;
    }
    
    @Override
    public void setRating(float rating)
    {
      this.rating = rating;
    } 
    @Override
    public float getRating() 
    {
        return rating;   
    }
    
}
