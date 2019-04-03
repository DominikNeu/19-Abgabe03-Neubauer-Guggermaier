package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	/**
	 * inits Calculator with CalculatorImpl
	 */
	@Before
	public void setup(){

		// SETUP PHASE
		calc = new CalculatorImpl();
	}

	@Test
	public void testAdd() {

		// EXERCISE PHASE
		double value = calc.add(5, 2);

		// VERIFY PHASE
		assertEquals(7, value, 0.001);
	}

	/**
	 * tests calculator function add
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testAdd2() {
		assertEquals(123, calc.add(100,23), 0.0001);
	}

	@Test
	public void testAdd3() {
		assertEquals(-123, calc.add(-246,123), 0.0001);
	}

	/**
	 * tests calculator function minus
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMinusWithPositiveValues() {
		assertEquals(46,calc.minus(50,4), 0.0001);
	}

	@Test
	public void testMinusWithNegativeValues() {
		assertEquals(-38,calc.minus(-42,-4), 0.0001);
	}

	@Test
	public void testMinusWithNegativeAndPositiveValues() {
		assertEquals(-46,calc.minus(-42,4), 0.0001);
	}

	/**
	 * tests calculator function multiply
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMultiply1() {
		assertEquals(1024,calc.multiply(512,2),0.0001);
	}

	@Test
	public void testMultiply2() {
		assertEquals(-1024,calc.multiply(512,-2),0.0001);
	}

	@Test
	public void testMultiply3() {
		assertEquals(30,calc.multiply(12,2.5),0.0001);
	}

	/**
	 * tests calculator function divide
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testDivide() {
		assertEquals(15,calc.divide(30,2), 0.0001);
	}

	@Test
	public void testDivide2() {
		assertEquals(5.6,calc.divide(28,0.2), 0.0001);
	}

	// VERIFY
	@Test(expected = ArithmeticException.class)
	public void testDivideWithNull(){
		// EXERCISE
		calc.divide(5, 0);
	}
}
