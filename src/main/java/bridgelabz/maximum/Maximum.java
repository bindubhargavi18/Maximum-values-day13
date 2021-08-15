package bridgelabz.maximum;

public class Maximum 
{
	public static void main(String[] args) 
	{
		System.out.println("Maximum is: "+maxOfThree(55,24,5));
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
}
