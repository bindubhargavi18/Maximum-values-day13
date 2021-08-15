package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloatTest {

	@Test
	public void test1() 
	{
		float result=MaxGenerics.maxValue(55.3f, 2.0f, 0.2f);
		assertEquals(55.3f,result,0.0);
	}
	
	@Test
	public void test2() 
	{
		float result=MaxGenerics.maxValue(5.3f, 241.0f, 0.2f);
		assertEquals(241.0f,result,0.0);
	}
	
	@Test
	public void test3() 
	{
		float result=MaxGenerics.maxValue(1.3f,1.0f, 102.2f);
		assertEquals(102.2f,result,0.0);
	}

}
