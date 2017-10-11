

import java.util.Scanner; 
public class QuadraticClient {
	public static void main(String[] args){
	boolean done = false;
		while(done = false) {
		System.out.println("Welcome to the Quatratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		
		System.out.println("a: ");
		Scanner a1 = new Scanner(System.in);
		double a = a1.nextDouble();
		
		System.out.println("b: ");
		Scanner b1 = new Scanner(System.in);
		double b = b1.nextDouble();
		
		System.out.println("c: ");
		Scanner c1 = new Scanner(System.in);
		double c = c1.nextDouble();
		
		while(done=false )
		QuadraticDescriber.quadrDescriber(a,b,c);
		System.out.println("Done? If done type quit.");
		Scanner tester = new Scanner(System.in);
		String tester1 = tester.next();
		if (tester.equals("quit"))
		done = true;
	}
	}
}
