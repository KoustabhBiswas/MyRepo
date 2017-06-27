/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author MRuser
 */
public class Aeroplane extends Automobile implements Flyer{

    @Override
    void Type() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Aeroplane is Flight");
    }

    @Override
    public void fly() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    System.out.println("Aeroplane is Flight");}

    @Override
    public void takeoff() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    System.out.println("Aeroplane is takingoff");}

    @Override
    public void landing() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Aeroplane is landing");
    }
    
}
