package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumTest 
{

	@Test
	public void test1() 
	{
		MaxGenerics<Integer> max=new MaxGenerics<Integer>(new Integer[] {10,20,30});
		int result=max.maxValue();
		assertEquals(30,result);
	}
	
	@Test
	public void test2() 
	{
		MaxGenerics<Integer> max=new MaxGenerics<Integer>(new Integer[] {42,44,1});
		int result=max.maxValue();
		assertEquals(44,result);
	}
	
	@Test
	public void test3() 
	{
		MaxGenerics<Integer> max=new MaxGenerics<Integer>(new Integer[] {123,4,5});
		int result=max.maxValue();
		assertEquals(123,result);
	}

}
