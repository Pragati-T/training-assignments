package rpncalculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RPNCalculatorTest {
	@Test
	public void testSimpleAddition()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		double result = rpnCalculator.evaluate("9 11 17 + +");
		assertEquals(37,result,0.001);
		assertEquals(122,rpnCalculator.evaluate("100 22 +"),0.001);

		
	}
	@Test
	public void testSimpleSubtraction()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		double result = rpnCalculator.evaluate("11 7 - ");
		assertEquals(4,result,0.001);

		
	}
	@Test
	public void testSimpleMultiplication()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		double result = rpnCalculator.evaluate("11 7 * ");
		assertEquals(77,result,0.001);

		
	}
	@Test
	public void testSimpleDivision()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		double result = rpnCalculator.evaluate("100 10 / ");
		assertEquals(10,result,0.001);

	}
	@Test
	public void testComplexOperation()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		double result = rpnCalculator.evaluate("100 50 / 10 9 + * ");
		assertEquals(38,result,0.001);

	}
}
