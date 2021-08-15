package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void test1() 
	{
		int result=Maximum.maxOfThree(55, 24, 5);
		assertEquals(55,result);
	}
	
	@Test
	public void test2() 
	{
		int result=Maximum.maxOfThree(3,102,-1);
		assertEquals(102,result);
	}
	
	@Test
	public void test3() 
	{
		int result=Maximum.maxOfThree(99,12,444);
		assertEquals(444,result);
	}

}
