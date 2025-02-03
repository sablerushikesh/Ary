package Array_in_task6;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int []a = {10,20,30};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0+i;j<a.length;j++)
			{
			temp=a[i]+a[j];
				System.out.println(a[j]);
			}
			 System.out.println(a[i]);
		}
		
		
	}

}

