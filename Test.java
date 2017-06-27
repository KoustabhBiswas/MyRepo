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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Accounts a;
        a=new SavingAccount();
        a.dipposit();
        a.withdraw();
        a=new CurrentAccount();
        a.dipposit();
        a.withdraw();
    }
    
}
