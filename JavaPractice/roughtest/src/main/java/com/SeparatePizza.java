package com;

import java.util.Scanner;
s


public class SeparatePizza {

	public static void main(String[] args) {
		String[] Name = {"Margeritta","Farmhouse","Spicegarden","ChesseBoust"};
		int[] namePrices = {350,450,520,570};

		
		String[] Base = {"Italian","DoubleChesse","ThinCrust","WheatBread"};
		int[] basePrices = {100,110,200,230};
		
		String[] toppings= {"Vegtetable","Mashroom","Onion","BlackOlive","GreenOlive","Chesse"};
		int[] toppingPrices = {40,50,30,70,60,10};

		String[] pizzaSize = {"S","M","L"};	
		int[] sizePrices = {200,480,520};

		Scanner inputDevice = new Scanner(System.in);

		System.out.println("Enter Name -Margeritta,Farmhouse,Spicegarden,ChesseBoust:");
		String nameChosen =inputDevice.nextLine();
		
		double namePrice =getPrice(Name, namePrices, nameChosen);

		System.out.println("Enter Base - Italian,DoubleChesse,ThinCrust,WheatBread :");
		String baseChosen = inputDevice.nextLine();
		
		double basePrice= getPrice(Base, basePrices, baseChosen);

		System.out.println("Enter Toppings -Vegtetable,Mashroom,Onion,BlackOlive,GreenOlive,Chesse :");
		String toppingChosen = inputDevice.nextLine();

		double toppingPrice = getPrice(toppings, toppingPrices, toppingChosen);

		System.out.print("Enter pizza size- S, M, L,: ");
		String sizeChosen= inputDevice.nextLine();

		double sizePrice = getPrice(pizzaSize, sizePrices, sizeChosen);

		System.out.println("The price for chosen pizza is Rs : "+ (sizePrice + toppingPrice+basePrice+namePrice));
	}

	private static double getPrice(String[] values, int[] prices, String chosenValue) {
		double price = 0;
		for(int s = 0; s < values.length; s++)
		{      
			if(chosenValue.equals(values[s]))
			{  
				price = prices[s];
			}
		}
		return price;
	}
}
