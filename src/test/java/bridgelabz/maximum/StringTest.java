package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest 
{
	MaxGenerics<String> max=new MaxGenerics<>();

	@Test
	public void test1() 
	{
		String result=max.maxValue("Peach","Banana","Apple");
		assertEquals("Peach",result);
	}
	
	@Test
	public void test2() 
	{
		String result=max.maxValue("Java","Python","JavaScript");
		assertEquals("Python",result);
	}
	
	@Test
	public void test3() 
	{
		String result=max.maxValue("Java","JavaScript","Python");
		assertEquals("Python",result);
	}
}
