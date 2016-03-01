package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Tuition.User_data;

public class Costs_Test {
	public static Cost Value1;
	public static Cost Value2; 
	public static Cost apr;
	public static Cost term; 
	public static Cost cost_of_college;
	public static Cost perc_increase; 


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		apr = new person.setApr(apr) = 2.5;
		term = new person.setTerm(term) = 12;
		cost_of_college = new person.setCost_of_college(cost_of_college) = 12500;
		perc_increase = new person.setPerc_increase(perc_increase) = 1.39
		Value1 = new Cost(87596.49)
		Value2 = new Cost(704.74)
		

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void calculate_cost(User_data person){
		assertTrue(person.calculate_cost(Value1));
		assertFalse(person.calculate_cost(Value2));


	}
	@Test
	public void repay_loan(User_data person,final_cost_of_college){
		assertTrue(person.repay_loan(Value2));
		assertFalse(person.repay_loan(Value1));

	}
	
}
