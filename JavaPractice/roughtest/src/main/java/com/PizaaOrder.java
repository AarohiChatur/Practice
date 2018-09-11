package com;

import java.util.Scanner;


public class PizaaOrder {



	public static void main(String[] args) {
		String[] Name = {"Margeritta","Farmhouse","Spicegarden","ChesseBoust"};
		String[] Base= {"Italian","DoubleChesse","ThinCrust","WheatBread"};
		String[] Toppings= {"Vegtetable","Mashroom","Onion","Blackolive","GreenOlive","Chesse"};
		String[] pizzaSize = {"S","M","L"};	
		int[] Prices = {200,480,520};

		double pizzaPrice = 0;
		Boolean vaildChoice = false;

		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Enter Name -Margeritta,Farmhouse,Spicegarden,ChesseBoust:");
		inputDevice.nextLine();

		System.out.println("Enter Base - Italian,DoubleChesse,ThinCrust,WheatBread :");
		inputDevice.nextLine();

		System.out.println("Enter Toppings -Vegtetable,Mashroom,Onion,Blackolive,GreenOlive,Chesse :");
		inputDevice.nextLine();

		System.out.print("Enter pizza size- S, M, L,: ");
		String sizeChosen= inputDevice.nextLine();

		int NUMBER_OF_SizeChoices = 3;

		for(int s = 0; s < NUMBER_OF_SizeChoices; ++s)
		{      

			if(sizeChosen == pizzaSize[s]);
			{  
				vaildChoice = true;
				pizzaPrice = Prices[s];
			}
		}

			if(vaildChoice)
				System.out.println("The price for chosen size " +
						sizeChosen + " is Rs :"+ pizzaPrice);
			else
				System.out.println("Sorry - Invalid Choice Entered");  
		
	}


}



