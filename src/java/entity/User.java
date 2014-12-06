/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author terrelkl
 */
public class User{
    
    ArrayList<String> data;
    
    String userName;
    String password;
    String md5password;
    
    model.db.DBQuery dbq = new model.db.DBQuery();
    model.db.DBCommand dbc = new model.db.DBCommand();
    
    public User() {
        // For use in registration
    }
    
    public User(String user, String pass) {
        this.userName = user.toLowerCase(); // Case Insensitive username will always be stored as lowercase.
        this.password = hashedPassword(pass);
        data = queryUser(user);
    }
    
    public boolean Registration(String userName, String password, String email, String Question, String Answer, String userClass) {
        String command = "INSERT INTO users (userName, password, email, securityQuestion, securityAnswer) VALUES ('"+userName+"','"+password+"','"+email+"','"+Question+"','"+Answer+"');";
        return dbc.executeCommand(command);
    }
    
    public boolean authenticate() {
        String query = "SELECT password FROM users WHERE userName='" + userName + "';";
        if (!data.isEmpty())
            if (dbq.executeQuery(query).get(4).equals(password))
                return true;
        return false;
    }
    
    private String hashedPassword(String pass) {
        String md5;
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            md.reset();
            byte[] bytes = md.digest(pass.getBytes());
            md5 = new BigInteger(1, bytes).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            md5 = "";
        }
        return md5;
    }
    
    private ArrayList<String> queryUser(String userName) {
        String query = "SELECT * FROM users WHERE userName='" + userName + "';";
        return dbq.executeQuery(query);
    }
    
    public String getData(int index) {
        return data.get(index);
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}