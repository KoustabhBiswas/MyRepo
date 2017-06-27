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
public class Test {
    public static void main(String []args){
        Flyer f;
        Bird b = new Bird();
        Aeroplane a = new Aeroplane();
        f =new Bird();
        f.fly();
        f.landing();
        f.takeoff();
        b.FoodHabbit();
        System.out.println();
        f= new Aeroplane();
        f.fly();
        f.landing();
        f.takeoff();
        a.Type();
        }
    }

