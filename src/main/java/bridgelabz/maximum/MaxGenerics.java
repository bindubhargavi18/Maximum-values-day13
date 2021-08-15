package bridgelabz.maximum;

public class MaxGenerics<T extends Comparable<T>> 
{
	T[] arr;
	T max;
	MaxGenerics(T arr[])
	{
		this.arr=arr;
	}
	public T maxValue()
	{
		T max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(max)>0)
			{
				max=arr[i];
			}
		}
		return max;
	}
}
