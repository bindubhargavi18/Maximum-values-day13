package bridgelabz.maximum;

public class Maximum 
{
	public static void main(String[] args) 
	{
		System.out.println("Maximum is: "+maxOfThree(55,24,5));
		System.out.println("Maximum is: "+maxOfThree(6.4f,22.1f,1.1f));
		System.out.println("Maximum is: "+maxOfThree("Java","JavaScript","Python"));
	}
	public static int maxOfThree(int num1,int num2,int num3)
	{
		if(num1>num2 && num1>num3)
			return num1;
		else if(num2>num1 && num2>num3)
			return num2;
		else
			return num3;
	}
	public static float maxOfThree(float num1,float num2,float num3)
	{
		if(num1>num2 && num1>num3)
			return num1;
		else if(num2>num1 && num2>num3)
			return num2;
		else
			return num3;
	}
	
	public static String maxOfThree(String str1,String str2,String str3)
	{
		if(str1.compareTo(str2)>0 &&  str1.compareTo(str3)>0)
			return str1;
		else if(str2.compareTo(str1)>0 &&  str2.compareTo(str3)>0)
			return str2;
		else
			return str3;
	}
}
