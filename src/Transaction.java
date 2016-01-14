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
    
}
