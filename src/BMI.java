import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		//defining all variables and scanner
		String input = "0";
		double weight, height, BMI;
		Scanner scnr = new Scanner(System.in);

		//loops as long as the user does not want to leave
		while(input.compareTo("L") != 0) {
								
			//asks the user if they want to calculate their BMI using Metric or Imperial or if they want to leave
			//they would input K, P, or L respectively
			System.out.println("Would you like to calculate your BMI in (K)g and Meters or (P)ounds and Inches?\nType L to (L)eave");
			input = scnr.nextLine();
			
			//this triggers if they want to use the Metic system
			if(input.compareTo("K") == 0 || input.compareTo("k") == 0) {
				//Prompts and reads in the weight in Kilograms
				System.out.println("Enter your weight in Kilograms:");
				weight = scnr.nextDouble();
				
				//Prompts and reads in the height in Meters
				System.out.println("Enter your height in Meters: ");
				height = scnr.nextDouble();
				
				//Calculates the user's BMI and outputs it
				BMI = weight / (height * height);
				System.out.println("Your BMI is: " + BMI);
				//uses their BMI to calculate what weight range they are in and outputs it
				category(BMI);
			}
			else if(input.compareTo("P") == 0 || input.compareTo("p") == 0) {
				//prompts and reads in the weight in Pounds
				System.out.println("Enter your weight in Pounds:");
				weight = scnr.nextDouble();
				
				//prompts and reads in the height in inches
				System.out.println("Enter your height in Inches: ");
				height = scnr.nextDouble();
				
				//calculates the user's BMI and outputs it
				BMI = (703 * weight) / (height * height);
				System.out.println("Your BMI is: " + BMI);
				//uses their BMI to calculate what weight range they are in and outputs it
				category(BMI);
			}
			else if(input.compareTo("L") != 0) {
				System.out.println("I don't understand the input, please try again.");
			}
		}
		scnr.close();
	}
	public static void category(double BMI) {
		//uses the cutoff values for the various categories to find what category the user would be in and output that
		if(BMI <= 18.5) {
			System.out.println("This places you in the Underweight category.");
		}
		else if(BMI < 24.9) {
			System.out.println("This places you in the Normal Weight category.");
		}
		else if(BMI < 29.9) {
			System.out.println("This places you in the Overweight category.");
		}
		else {
			System.out.println("This places you in the Obesity category.");
		}
	}

}
