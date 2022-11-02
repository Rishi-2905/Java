package test;

import java.util.Arrays;

public class RBinarysearch {

	public static void main(String[] args) {
		
		int arr[]= {3,2,34,56,87,9};
		Arrays.sort(arr);
		int len=arr.length;
		int mid=len/2;
		int t=87;
		if(arr[mid]==t) 
		{
			System.out.println("Element Found "t);
		}
		else if(arr[mid]<t)
		{
			for(int i=mid+1;i<len;i++)
			{
				if(arr[i]==t)
				{
					System.out.println("Element found "+t);
					break;
				}
			}
		}
		else
		{
			for(int j=mid+1;j<len;j++)
			{
				if(arr[j]==t)
				{
					System.out.println("Element found "+t);
					break;
				}
			}
		}
	
      
	}

}
