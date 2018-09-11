//class
public class Basic{	

	// method or function
	// main(parameter)
	public static void main(String[] arg) {
		System.out.println("Entry main");
		System.out.println("Adding");
		int result = add(1, 5);
		System.out.println("Got result : " + result);
		System.out.println("Squaring " + result);
		int finalResult = square(result);
		System.out.println("finalResult: "+ finalResult);
		System.out.println("Exit main");
	}

	public static int add(int x, int y) {
		System.out.println("Entry add");
		System.out.println("Adding : " + x + " and " + y);
		
		int sum=x+y;
		System.out.println("sum="+sum);
		System.out.println("Exit add");
		return sum;
	}

	public static int square(int x) {
		System.out.println("Entry square");
		System.out.println("Calculate square of " + x);
		
		int result = x*x;
		System.out.println("x^2="+result);	
		System.out.println("Exit square");
		return result;
	}
}
