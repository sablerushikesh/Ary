package Array_in_task7;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		
		int size=sc.nextInt();
		int arr[] = new int [size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("printing array elements");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr "+arr[i]);
		}
	
	}

}
