
import junit.framework.TestCase;

public class TestCalculator extends TestCase
{
	public void testAdd()
	{
		Calculator calculator = new Calculator();
		double result = calculator.add(10,50);
		assertEquals(50, result, 0);
	}
}
