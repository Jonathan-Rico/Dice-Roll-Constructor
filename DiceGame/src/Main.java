import java.util.Scanner;
public class Main {	
	public static void main(String args []) {		
		System.out.printf("Please type in the number of times you want the die to be rolled\n");
		Scanner input = new Scanner(System.in);
		int bounces = input.nextInt();		
		Dice dice = new Dice();
		System.out.printf("The die has been rolled %d times\nThe dice rolls are\n", bounces);

		int y = dice.Throw(bounces);
		
		int avg = y/bounces;
		System.out.printf("The dice rolls have an average value of %d", avg);	
	}
}