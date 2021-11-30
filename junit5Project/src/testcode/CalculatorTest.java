package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Calculator;

public class CalculatorTest {

	 // create a object of  a class to be tested
	private Calculator calc;
	
	/*@Before annotation in JUnit is used on a method containing Java code to run before each test case. 
	 * i.e it runs before each test execution.*/
	@Before
	public void setUp() throws Exception {
		
		calc=new Calculator();
	}

	
	/*@After annotation is used on a method containing java code to run after each test case. 
	 * These methods will run even if any exceptions are thrown in the test case or in the case of assertion failures.*/
     
	
	public int sum(int[] numbers) {
	int sum = 0;
	for (int i : numbers) {
	sum += i;
	}
	return sum;
	}


	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
