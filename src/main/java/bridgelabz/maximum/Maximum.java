package bridgelabz.maximum;

public class Maximum 
{
	public static void main(String[] args) 
	{
		int maximum1=MaxGenerics.maxValue(10,2,3);
		System.out.println("Maximum of integer: "+maximum1);
		
		float maximum2=MaxGenerics.maxValue(22.1f,122.0f,3.3f);
		System.out.println("Maximum of Float: "+maximum2);
		
		String maximum3=MaxGenerics.maxValue("Python","Java","JavaScript");
		System.out.println("Maximum of String: "+maximum3);
		
	}
}
