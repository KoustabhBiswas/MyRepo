package pack2;
import java.util.*;
public class Area_var extends Area_print {
	public void Area_cal(){
		int length,width;
		Scanner sc = new Scanner(System.in);
		super.length();
		length= sc.nextInt();
		super.width();
		width = sc.nextInt();
		System.out.println("Area is ::::"+(length*width));
	}
}
