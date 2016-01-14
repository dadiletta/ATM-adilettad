/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adilettad
 */
import java.util.ArrayList;
import java.util.Random;

public class Bank {
    
    /**
     * The name of the bank
     */
    private String name;
    
    /**
     * The list of users at this bank
     */
    private ArrayList<User> users;
    
    /**
     * The list of all accounts at the bank
     */
    private ArrayList<Account> accounts;
    
    /**
     * Generate a new universally unique ID for a user
     * @return  the uuid
     */
    public String getNewUserUUID(){
        
        //inits
        String uuid;
        Random rng = new Random();
        int len = 6; 
        boolean nonUnique;
        
        do {
            uuid = ""; //start with a blank UUID
            
            //generate a random number
            for(int k = 0; k < len; k++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            nonUnique = false;
            //check to see if it's unique
            for(User u : this.users){
                if(uuid.compareTo(u.getUUID())== 0){
                    nonUnique = true;
                    break;
                }
            }
            
        } while(nonUnique);
        
        //now that we know it's unique, return the sucker
        return uuid;
        
    }
    
    public String getNewAccountUUID(){
        
        //inits
        String uuid;
        Random rng = new Random();
        int len = 10; 
        boolean nonUnique;
        
        do {
            uuid = ""; //start with a blank UUID
            
            //generate a random number
            for(int k = 0; k < len; k++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            nonUnique = false;
            //check to see if it's unique
            for(Account a : this.accounts){
                if(uuid.compareTo(a.getUUID())== 0){
                    nonUnique = true;
                    break;
                }
            }
            
        } while(nonUnique);
        
        //now that we know it's unique, return the sucker
        return uuid;
    }
    
    /**
     * Add an account to the instance arraylist
     * @param anAcct    the account to add 
     */
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    
}
