package maven.SampleMaven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
 
 
public class CalculateTest {
	private static Calculator cobj;
	
	@BeforeAll
	public static void setAll() {
		cobj = new Calculator();
		
	}
	@Test
	public void testAddNums() {
		
		assertEquals(74,cobj.addNumber(34, 40));
	}
	@Test
	public void testIsOdd() {
		assertTrue(cobj.odd(3));
	}
	@Test
	public void testIsEven() {
		assertTrue(cobj.even(6));
	}
	@Test
	public  void testDiv() {
		assertEquals(2,cobj.div(16, 8));
	}
	@Test
	public void testDivExep() {
		assertThrows(ArithmeticException.class,()-> cobj.div(9, 0));
	}
	
	
 
}