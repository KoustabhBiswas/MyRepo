/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import java.util.Scanner;
/**
 *
 * @author Koustabh
 */
public class Sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner sc = new Scanner(System.in);
         
        print obj1 = new print();
        
        obj1.helloworld();
                
        //code for add two numbers
        System.out.println("enter first number");
        int n1 = sc.nextInt();
        System.out.println("enter second number");
        int n2 = sc.nextInt();
        int sum = obj1.sum(n1, n2);
        System.out.println("Sum of two Number is::"+sum);
                 
    }
    
}
