package bridgelabz.maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloatTest {

	@Test
	public void test1() 
	{
		MaxGenerics<Float> max=new MaxGenerics<Float>(new Float[] {10.3f,2.0f,33.0f});
		float result=max.maxValue();
		assertEquals(33.0f,result,0.0);
	}
	
	@Test
	public void test2() 
	{
		MaxGenerics<Float> max=new MaxGenerics<Float>(new Float[] {101.3f,9.0f,33.0f});
		float result=max.maxValue();
		assertEquals(101.3f,result,0.0);
	}
	
	@Test
	public void test3() 
	{
		MaxGenerics<Float> max=new MaxGenerics<Float>(new Float[] {10.3f,22.0f,3.0f});
		float result=max.maxValue();
		assertEquals(22.0f,result,0.0);
	}

}
