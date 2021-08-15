package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloatTest {

	@Test
	public void test1() 
	{
		float result=Maximum.maxOfThree(55.3f, 24.0f, 5.2f);
		assertEquals(55.3f,result,0.0);
	}
	
	@Test
	public void test2() 
	{
		float result=Maximum.maxOfThree(5.3f, 241.0f, 0.2f);
		assertEquals(241.0f,result,0.0);
	}
	
	@Test
	public void test3() 
	{
		float result=Maximum.maxOfThree(5.13f,41.0f, 109.2f);
		assertEquals(109.2f,result,0.0);
	}

}
