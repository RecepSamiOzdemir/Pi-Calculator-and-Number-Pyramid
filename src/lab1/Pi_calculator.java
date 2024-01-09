package lab1;

public class Pi_calculator {
	public static void main(String[] args) {
		int term ; 
		double pi = 0.0, newpi = 0.0; // pi and newpi variables for holding a 8 digits number
		System.out.println("Term    Pi");// it adds title
		for(term = 1; term <= 200; term++) { // term is for holding turn number
			if(term ==1) {// this condition for make first calculation correct
				newpi = pi + (4.0/((2*(term-1))+1));
			}
			if(term%2 == 0){// this condition does calculation
				newpi = pi - (4.0/((2*(term-1))+1));
			}else {
				newpi = pi + (4.0/((2*(term-1))+1));
			}
			System.out.printf("%-6s  %.6f%n", term, newpi); //this if prints data's correctly
			pi = newpi; // this is makes loops correctly.
		}
	}
}
