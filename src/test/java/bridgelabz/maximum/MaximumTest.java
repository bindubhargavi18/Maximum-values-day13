package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumTest 
{
	MaxGenerics<Integer> max=new MaxGenerics<>();

	@Test
	public void test1() 
	{
		int result=max.maxValue(55, 24, 5);
		assertEquals(55,result);
	}
	
	@Test
	public void test2() 
	{
		int result=max.maxValue(3,102,-1);
		assertEquals(102,result);
	}
	
	@Test
	public void test3() 
	{
		int result=max.maxValue(99,12,444);
		assertEquals(444,result);
	}

}
