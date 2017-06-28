package pack1;
import java.util.*;

public class Constructor_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 ,var2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number::");
		var1 = sc.nextInt();
		
		Constructor_method c  = new Constructor_method(var1);
		System.out.println("Enter the Second number::");
		var2 = sc.nextInt();
	    Constructor_method c1 = new Constructor_method(var1, var2);
	}

}
