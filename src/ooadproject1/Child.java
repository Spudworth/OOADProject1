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
    int age;
    int childId;
    
    public Child()
    {
        setUserName("Felicia");
        chkIsChild(true);
        chkIsAdmin(false);
        setPassword("01234567");
    }
}
