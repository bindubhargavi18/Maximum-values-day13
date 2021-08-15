package bridgelabz.maximum;

public class MaxGenerics<T extends Comparable<T>> 
{
	T val1;
	T val2;
	T val3;
	MaxGenerics(T val1,T val2,T val3)
	{
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
	}
	public static <T extends Comparable<T>> T maxValue(T val1,T val2,T val3)
	{
		T max=val1;
		if(val2.compareTo(max)>0)
		{
			max=val2;
		}
		if(val3.compareTo(max)>0)
		{
			max=val3;
		}
		return max;
	}
}
