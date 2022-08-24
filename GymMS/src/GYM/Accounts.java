/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GYM;

/**
 *
 * @author j-stock
 */
public abstract class Accounts {
   

    protected abstract void setData(String username,String password,String Type);  

    protected abstract void setData(String username,String password);

    protected abstract void setData(String type);

    protected abstract String getUsername();

    protected abstract String getPassword();

    protected abstract String getType();
    
}
