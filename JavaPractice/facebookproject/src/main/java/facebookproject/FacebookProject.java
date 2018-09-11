package facebookproject;

import java.util.Scanner;

public class FacebookProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("\n how many names you want : "  );
		int number = input.nextInt();

		input.nextLine();
		String[] result = new String[number];
		int[] age= new int[number];

		for (int i=number-1; i>=0; i-- ) {
			System.out.print("Enter First Name :");
			String	f = input.nextLine();
			System.out.print("Enter Middle Name :");
			String m = input.nextLine();
			System.out.print("Enter Last Name :");
			String l = input.nextLine();
			System.out.println("Enter age");
			int age1 =input.nextInt();
			input.nextLine();
			age[i]= age1;
			result[i] = f + " "+ m +" "+ l ; 
		}

		System.out.println("total Names : "+  number);
		for(int j=1; j<=number ;j++)
		{		
			System.out.println(j + ". " + result[j-1]);
		}

		System.out.println("Enter Number : " );
		int index = input.nextInt();
		input.nextLine();

		System.out.println("age : "+ age[index-1]);
	}
}
