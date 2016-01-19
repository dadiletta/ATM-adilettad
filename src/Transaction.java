/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adilettad
 */
import java.util.Date;

public class Transaction {
    
    /**
     * The size of the transaction
     */
    private double amount;
    
    /**
     * The time of the transaction, using Java's Date object
     */
    private Date timestamp;
    
    /**
     * An optional note about the purpose of the transaction
     */
    private String memo;
    
    /**
     * The account from which this transaction originates 
     */
    private Account inAccount;
    
    /**
     * Transaction constructor
     * @param amount        the size of the transaction
     * @param inAccount     the account from where the transaction originates
     */
    public Transaction(double amount, Account inAccount){
        
        //set values
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
        
    }
    
    /**
     * Second of the overloaded Transaction constructors
     * @param amount    size of transaction
     * @param memo      note from user
     * @param inAccount user's account
     */
    public Transaction(double amount, String memo, Account inAccount){
        
        //call the first constructor
        this(amount, inAccount);
        
        //fill in the missing piece from the first constructor
        this.memo = memo;
        
        
    }
    
}
