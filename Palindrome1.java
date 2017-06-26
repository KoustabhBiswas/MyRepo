package Pack2;
import java.util.*;
public  class Palindrome1 {
	int num,rev=0,rem,orginnum;
	 public void pal(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 num = sc.nextInt();
		 orginnum = num;
		 while(num>0){
			 rem = num%10;
			 num = num/10;
			 rev  = rev*10+rem;
			
		 }
		 
	  if (orginnum==rev) {
			System.out.println("This is Palindrome and the number is"+rev);
		}else{
			System.out.println("This is not Palindrome ");
		} 
	 }
	 }
