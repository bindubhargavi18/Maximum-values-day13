package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest 
{
	@Test
	public void test1() 
	{
		String result=MaxGenerics.maxValue("Peach","Banana","Apple");
		assertEquals("Peach",result);
	}
	
	@Test
	public void test2() 
	{
		String result=MaxGenerics.maxValue("Java","Python","JavaScript");
		assertEquals("Python",result);
	}
	
	@Test
	public void test3() 
	{
		String result=MaxGenerics.maxValue("Java","JavaScript","Python");
		assertEquals("Python",result);
	}
}
