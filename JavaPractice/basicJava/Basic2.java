
// public class Basic2 {
	
	// public static void main(String[] arg) {
		// String result = fullname("Arohi", "Tins", "Chaturvedi");
		// System.out.println("Fullname: " + result);
	// }

	  //public static String fullname(String fname, String mname, String lname) {
		//String result = fname + " " + mname + " " + lname;            
		//return result;
	//}
   

//}



import java.util.Scanner;
	public class Basic2
{
		public static void main(String[] args)    {
		final int NUMBER_OF_CHOICES = 4;
		String[] pizzaSize = {"S", "M", "L", "X"};
		double[] prices = {6.99, 8.99, 12.50, 15.00};
		String sizeChosen;
		double pizzaPrice = 0.0;
		boolean validChoice = false;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter pizza size- S, M, L, or X: ");
		sizeChosen = inputDevice.nextLine();
		for(int s = 0; s < NUMBER_OF_CHOICES; ++s)
		{      

            if(sizeChosen == pizzaSize[s]);
            {  
                validChoice = true;
                pizzaPrice = prices[s];
            }
        }
        if(validChoice)
            System.out.println("The price for chosen size " +
                    sizeChosen + " is $" + pizzaPrice);
        else
        	System.out.println("Sorry - Invalid Choice Entered");  
    }
}
