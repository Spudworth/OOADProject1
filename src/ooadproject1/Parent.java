/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject1;

/**
 *
 * @author mrlyo
 */
public class Parent extends Person {
    
    int parentId;
    
    public Parent(int parentId)
    {
        
        
        
        this.parentId = parentId;       
        
    }
    
    public void setParentId(int parentPlayerId) {
    
        this.parentId = parentPlayerId;
    
    }
    
    public int getParentId() {
    
        return parentId;
    
    }
    
}
