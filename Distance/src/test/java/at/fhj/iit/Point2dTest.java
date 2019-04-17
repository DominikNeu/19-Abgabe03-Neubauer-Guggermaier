package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class Point2dTest {

	private Point2d point2d;
	/**
	 * Set some Point2d for testing their functionality
	 */
	@Before
	public void setup(){
		point2d = new Point2d();
		point2d.setY(4);
		point2d.setX(3);
	}

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		assertEquals(3, point2d.getX(),0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		assertEquals(4, point2d.getY(),0.001);
	}


	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		assertEquals(2,point2d.distanceFrom(new Point2d(3,2)),0.001);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		assertEquals(5,point2d.distanceFromOrigin(),0.001);
	}
}
