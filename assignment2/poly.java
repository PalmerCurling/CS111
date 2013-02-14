public class poly{
	public static void main (String args[]){
		System.out.println("first root?");
		int a = IO.readInt();
		
		System.out.println("second root?");
		int b = IO.readInt();
		
		System.out.println("third root?");
		int c = IO.readInt();
		
		//calculations
		int d = -(a*b*c);
		int e = (a*b)+(a*c)+(b*c);
		int f = -(c+b+a);
	

		//display of function
		System.out.println("the polynomial equation is");
		System.out.println("(x-" +a+ ") * (x-" +b+ ") * (x-" +c+ ") = 0");
		
		System.out.println("the canonical form of the polynomial is");
		System.out.println("x^3 + " +f+ "x^2 + " +e+ "x + " +d );

	}
}
