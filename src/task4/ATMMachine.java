/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static task4.AtmLogin.currentBalance;

/**
 *
 * @author Govind Kumar
 */
public class ATMMachine {
    

    
    
    public void withdrawAmount(double withdraw){
        WithdrawFrame withdrawFrame = new WithdrawFrame();
        if(withdraw > currentBalance){
            JOptionPane.showMessageDialog(withdrawFrame, "Insufficient Balance.");
        }else{
            currentBalance -= withdraw;
            JOptionPane.showMessageDialog(withdrawFrame, "Withdraw Successfully...\nNew balance: "+currentBalance);
            
        }
    }
    
    public void depositeAmount(double deposite){
        DepositeFrame depositeFrame = new DepositeFrame();
        currentBalance += deposite;
        JOptionPane.showMessageDialog(depositeFrame, "Deposite Successfully...\nNew balane: "+currentBalance);
    }
    
    public void getBalance(){
        ATMMenu atmMenu = new ATMMenu();
        
            JOptionPane.showMessageDialog(atmMenu,"Your current balance is "+currentBalance);

        
    }
    
    
    
}
