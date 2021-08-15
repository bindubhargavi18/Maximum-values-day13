package bridgelabz.maximum;

public class Maximum 
{
	public static void main(String[] args) 
	{
		MaxGenerics<Integer> max=new MaxGenerics<Integer>(new Integer[] {10,20,30,80});
		System.out.println("Max in integer array: "+max.maxValue());
		
		MaxGenerics<Float> max1=new MaxGenerics<Float>(new Float[] {10.3f,2.0f,33.0f});
		System.out.println("Max in float array: "+max1.maxValue());
		
		MaxGenerics<String> max2=new MaxGenerics<String>(new String[] {"Apple","Peach","Banana"});
		System.out.println("Max in string array: "+max2.maxValue());
	}
}
