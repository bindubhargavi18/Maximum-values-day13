package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest 
{
	@Test
	public void test1() 
	{
		MaxGenerics<String> max=new MaxGenerics<String>(new String[] {"Apple","Peach","Banana"});
		String result=max.maxValue();
		assertEquals("Peach",result);
	}
	
	@Test
	public void test2() 
	{
		MaxGenerics<String> max=new MaxGenerics<String>(new String[] {"Peach","Apple","Banana"});
		String result=max.maxValue();
		assertEquals("Peach",result);
	}
	
	@Test
	public void test3() 
	{
		MaxGenerics<String> max=new MaxGenerics<String>(new String[] {"Apple","Banana","Peach"});
		String result=max.maxValue();
		assertEquals("Peach",result);
	}
}
