package bridgelabz.maximum;

public class Maximum 
{
	public static void main(String[] args) 
	{
		System.out.println("Maximum is: "+maxOfThree(55,24,5));
		System.out.println("Maximum is: "+maxOfThree(6.4f,22.1f,1.1f));
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
}
