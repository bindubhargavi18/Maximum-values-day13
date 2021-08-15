package bridgelabz.maximum;

public class Maximum 
{
	public static void main(String[] args) 
	{
		MaxGenerics<Integer> maximum1=new MaxGenerics<>();
		System.out.println("Maximum of integer: "+maximum1.maxValue(10,2,3));
		MaxGenerics<Float> maximum2=new MaxGenerics<>();
		System.out.println("Maximum of Float: "+maximum2.maxValue(22.1f,122.0f,3.3f));
		MaxGenerics<String> maximum3=new MaxGenerics<>();
		System.out.println("Maximum of String: "+maximum3.maxValue("Python","Java","JavaScript"));
		
	}
}
