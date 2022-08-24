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
public class EmployeesAcc extends Accounts {
 private String username;
 private String password;
 private String type;

    @Override
    public void setData(String username,String password,String type) {
        this.username = username;
        this.password=password;
        this.type=type;
    }
    @Override
    public void setData(String username,String password) {
        this.username = username;
        this.password=password;
    }
    @Override
    public void setData(String type){
        this.type=type;
    }
    @Override
     public  String getUsername(){
         return username;
     }

    @Override
    public  String getPassword(){
        return password;
    }

    @Override
    public  String getType(){
        return type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
