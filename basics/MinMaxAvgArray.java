package basics;
import java.util.Scanner;
public class MinMaxAvgArray {

	public static void main(String[] args) {
		/*
		 Write 3 functions that take an array as a parameter and return the minimum,
		average, and maximum values of that array.
		 */
		
		Scanner console=new Scanner(System.in);
		System.out.println("Give the max index of the array: ");
		int x=console.nextInt();
		int[] a=new int[x];//new type[size]
		for(int i=0;i<x;i++)
		{
			System.out.print("Give the value of a["+i+"]= ");
			a[i]=console.nextInt();
					
		}
		System.out.println("The array values are: ");
		for(int i=0;i<x;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("The max value of the array is: "+maxValue(a));
		System.out.println("The min value of the array is: "+minValue(a));
		System.out.println("The AVG the array is: "+avgValues(a));
	}
	public static int maxValue(int[] a)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static int minValue(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]<min)//
				min=a[i];
		return min;
	}
	public static double avgValues(int[]a) {
		int nr=0,sum=0;
		double avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			nr++;
		}
		avg=(double)sum/nr;
		return avg;
	}

}
