package lab1;

import java.util.Scanner;

public class Number_pyramid {
	public static void main(String[] args) {
		 int number,row, i, extra; // row variable is for holding which turn of loop is, i for counting loops and number is for replacement of read string variable.
		 Scanner scanner = new Scanner(System.in);

		 while(true){
			 System.out.println("Please enter a number between 1-50.");
			 System.out.println("For closing the program please enter 'q'.");
			 String input = ""; // input is read variable
			 input = scanner.nextLine();
			 
			 if(input.equals("q")) { // this condition for quieting program
				 System.out.println("See you later ^^.");
				 break;
			 }else {
				 number = Integer.valueOf(input);
				 if(number <= 0 || number > 50) {// this condition for check number is between 1-50. if it is not program print alert.
					 System.out.println("Please read carefully what instruactions are saying...");
				 }else {
					 for(row = 1 ; row <= number; row++){// this loop run program by given number
						 extra = number - row;
						 
						 for(i = 1; i <= (2*(number - row) + extra); i++){//this loop add spaces before printing number
							 System.out.print(" ");
						 }
						 for(i = row; i >= 1; i--) {// this loop prints first half of pyramid which x ... 1
							 if(i < 10){
								 System.out.print(i+ "  ");
							 }else {
								 System.out.print(i+ " ");
							 }	
						 }
						
						 for(i = 2; i <= row; i++) { // this loop prints second half of pyramid which 2 ... x
							 if(i < 10){
								 System.out.print(i+ "  ");
							 }else {
								 System.out.print(i+ " ");
							 }
						 }
					System.out.println(" "); // it gets second row
					}
				 }
			 }
		 }
		 scanner.close(); // it closes scanner
	 }
}
