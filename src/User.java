/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adilettad
 */
import java.security.MessageDigest;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    
    /**
     * The user's first name
     */
    private String firstName;
    
    /**
     *The user's last name
     */
    private String lastName;
    
    /**
     * The User's unique identifier
     */
    private String uuid;
    
    /**
     * We'll use Java's MD5 encryption to store pin numbers
     */
    private byte pinHash[];
    
    /**
     * List of accounts this user owns
     */
    private ArrayList<Account> accounts;
    
    /**
     * Constructor for a new User
     * @param firstName Local variable that will be stored as instance var
     * @param lastName  **
     * @param pin       We'll use a MD5 MessageDigest to process
     * @param theBank   Need the bank so we can call it's methods
     */
    public void User(String firstName, String lastName, String pin,
            Bank theBank){
        
        this.firstName = firstName;
            
        this.lastName = lastName;
        
        try {       
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Caught a NoSuchAlgorithmException");
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            //Kick the user out
            System.exit(1);
        }
        
        //Ask the bank to generate an ID number
        this.uuid = theBank.getNewUserUUID();
        
        //Alert the console of a new user
        System.out.printf("New user %s, %s with ID %s created. \n", lastName,
                firstName, this.uuid);
    }
    
    /**
     * Add an account to the instance arraylist
     * @param anAcct    the account to add 
     */
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    
    /**
     * Accessor method for the user UUID
     * @return  user uuid
     */
    public String getUUID(){
        return this.uuid;
    }
    
}
