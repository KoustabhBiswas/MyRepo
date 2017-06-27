/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author MRuser
 */
public class SavingAccount implements Accounts{
    @Override
    public void withdraw(){
        System.out.println("Withdraw money from saving account");
    }

    @Override
    public void dipposit() {
          System.out.println(" Dipposit money to saving account");
    }
    
}
