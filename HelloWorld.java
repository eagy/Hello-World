
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.out.println(counter(5));
	}
	
	public static int counter(int n) {
		if (n == 1)
			return 1;
		else
			return n+counter(n-1);
	}

}
