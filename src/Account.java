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

public class Account {
    
    /**
     * The type of account
     */
    private String name;
    
    /**
     * Unique universal ID, alphanumeric
     */
    private String uuid;
    
    /**
     * The User object associated with the account
     */
    private User holder;
    
    /**
     * A list of all transactions associated with this account
     */
    private ArrayList<Transaction> transactions;
    
    public void Account(String name, User holder, Bank theBank){
        
        //set basic values
        this.name = name;
        this.holder = holder;
        
        //ask the bank to issue a new UUID for this account
        this.uuid = theBank.getNewAccountUUID();
        
        //Init the list of transactions for this account
        this.transactions = new ArrayList<>();
        
        //add the holder and the bank
        holder.addAccount(this);
        theBank.addAccount(this);
        
        
        
        
        
    }
    
    /**
     * Accessor method for Account uuid
     * @return  account uuid
     */
    public String getUUID(){
        return this.uuid;
    }
}
