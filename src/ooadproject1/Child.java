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
public class Child extends Person {
    private int age;
    private int childId;
    
    public Child(int age, int childId)
    {
        
        this.age = age;
        this.childId = childId;
        
    }
    
    public void setAge(int playerAge) {
    
        this.age = playerAge;
    
    }
    
    public void setChildId(int childPlayerId) {
    
        this.childId = childPlayerId;
    
    }
    
    public int getAge() {
    
        return age;
    
    }
    
    public int getChildId() {
    
        return childId;
    
    }
}
