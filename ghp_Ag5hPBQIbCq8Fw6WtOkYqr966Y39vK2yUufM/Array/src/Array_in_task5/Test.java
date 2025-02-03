package Array_in_task5;

public class Test {
	
	public static void main(String[] args) {
		
		int arr[] = {111,2,30,40,60};
		
		int min=arr[0];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] <min)
			{
				min=arr[i];
				
			}
	}
		System.out.println(min);
	}
		

}