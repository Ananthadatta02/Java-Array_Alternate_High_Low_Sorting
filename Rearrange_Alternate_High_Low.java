package rearranging_and_Advanced_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange_Alternate_High_Low 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int arr[] = new int[a.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(a[j]>a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int low = 0;
		int high = a.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
				arr[i] = a[high--];
			else
				arr[i] = a[low++];
		}
		System.out.println(Arrays.toString(arr));
	}
}
