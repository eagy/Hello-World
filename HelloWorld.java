/**
 * 
 * @author Daniel Eagy
 * @version 1.2
 */

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello World");
		
		System.out.println(counter(5));
		
		int hoopla = kb.nextInt();
		System.out.println(hoopla);
		
	}
	
	public static int counter(int n) {
		if (n == 1)
			return 1;
		else
			return n+counter(n-1);
	}
	

}
