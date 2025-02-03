package Array_in_task4;

public class Test {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		arr[3] = 104;
		arr[4] = 105;
		System.out.println();
		
		arr[4]=105;
		//System.out.println(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.print(arr[i]+"\t");
		}
	}

}
