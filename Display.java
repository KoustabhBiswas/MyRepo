 
import java.util.Scanner;
 
 class Accounts {
    public void show(){
        System.out.println("Enter your type of account");
    }
}

  class Current extends Accounts {
        
    public void show(){
        System.out.println("This is Current Account");
    }
}

  class Saving extends Accounts{
     public void show(){
         System.out.println("This is Saving class");
     }
}

 public class Display {
  public static void main(String[] args) {
        // TODO code application logic here
        int ch;
        Accounts a;
        Scanner sc = new Scanner(System.in);
        
a = new Accounts();
 
        System.out.println("Enter 1.Current Account  choice");
       System.out.println(" Enter 2.   Saving Account Choice");
	a.show();
	 
	ch = sc.nextInt();
         switch(ch){
             case 1:a = new Current();
                    a.show();
                    break;
	     case 2:a = new Saving();
                    a.show();
                    break;
         }
    }
}
    