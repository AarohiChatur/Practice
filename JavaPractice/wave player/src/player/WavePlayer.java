package player;

import java.util.Scanner;

public class WavePlayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] Month= {"January","February","March","April","May","June","July","August","September","October","November","December"};

		System.out.println("Enter the Month :");
		int monthNumber = input.nextInt();

		input.nextLine();

		System.out.println("Print Result : "+ Month[monthNumber-1]);
	}
}
