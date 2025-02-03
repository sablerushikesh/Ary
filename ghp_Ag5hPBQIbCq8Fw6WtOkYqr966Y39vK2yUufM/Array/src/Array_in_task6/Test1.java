package Array_in_task6;

public class Test1 {
	
	public static void main(String[] args) {
		
		int [] a= new int[1];
		
		int [] ar= {30,60,80,40};
		
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp =ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	
	}

}
