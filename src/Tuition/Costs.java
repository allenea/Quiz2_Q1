package Tuition;

import java.util.Scanner;

//import finance.User_data;


public class Costs {
	/** Main Method  */

	public static void main(String args[]) {
		/** Get person to input values  */
		User_data person = new User_data();
		/** Input Values to the person */
		person = getValues(person);
		/** calculate total cost of college  */
		double final_cost_of_college = calculate_cost(person);
		/** calculate monthly payment */
		double monthly_payment = repay_loan(person, final_cost_of_college);
		/** Print this  */
		System.out.print("Over the next 4 years it will cost you $");
		System.out.printf("%.2f", final_cost_of_college);
		System.out.print("\n");
		System.out.print("It will cost you $");
		System.out.printf("%.2f", monthly_payment);
		System.out.print(" every month" + " at " + person.getApr() + "% loan interest rate");
		System.out.print(
				" over then next " + person.getTerm() + " year(s) in order " + "to have no college debt");

	}


	public static User_data getValues(User_data person) {
		
		/** Create Scanner  */

		Scanner user_input = new Scanner(System.in);
		
		/** Prompt User to input value  */

		System.out.print("Enter Initial Tuition Cost: ");
		double cost_of_college = user_input.nextDouble();
		person.setCost_of_college(cost_of_college);

		
		/** Prompt User to input percentage  */

		System.out.print("Enter Precent Increase in Cost: ");
		double perc_increase = user_input.nextDouble();
		person.setPerc_increase(perc_increase);

		/** Prompt User to input percentage  */
		
		System.out.print("Enter Fixed APR on Student Loan: ");
		double apr = user_input.nextDouble();
		person.setApr(apr);

		/** Prompt User to input value  */

		System.out.print("Enter Years to Pay Off Loan: ");
		double term = user_input.nextDouble();
		person.setTerm(term);
		
		/** end user input  */

		user_input.close();
		return(person);
	}
	
	public static double calculate_cost(User_data person) {
		double final_cost_of_college = person.getCost_of_college();
		for (int year = 1; year < 4; year++){
			final_cost_of_college = final_cost_of_college + (person.getCost_of_college() * Math.pow(person.getPerc_increase(),year));
		}	
	
		return final_cost_of_college;
	}
	
	//THIS IS GOING TO BE A SUBSIDIZED LOAN. B/C it was not specified and that is how I interpret this project.
	public static double repay_loan(User_data person, double final_cost_of_college) {
		double monthly_payment = (final_cost_of_college * (((person.getApr() / 100) / 12)) / (1-(Math.pow(1 + (person.getApr() / 100) / 12, (person.getTerm() * - 12)))));
		return monthly_payment;
	}
	
}
