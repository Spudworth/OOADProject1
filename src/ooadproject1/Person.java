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
public abstract class Person {
    private String userName;
    private String passsword;
    private Boolean IsAdmin;
    private Boolean IsChild;
      public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setPassword(String userPassword)
    {
        passsword = userPassword;
    }
    public  Boolean chkIsChild(Boolean IsChild)
    {
        if(IsChild == true)
            return true;
        else
        return false;
    }
    public Boolean chkIsAdmin(Boolean isAdmin)
    {
        if(isAdmin == true)
            return true;
        else 
            return false;
    }
    public String getUserName()
    {
        return userName;
    }
    public String getPassword()
    {
        return passsword;
    }
}
