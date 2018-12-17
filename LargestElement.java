import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("How many no you want to add in array");
		int n=s.nextInt();
		
		int[] arr =new int[n];
		
		System.out.println("Enter "+n+" no.");
		for(int i=0;i<n;i++)
		{
			
			arr[i]=s.nextInt();
		}
		
		int max=0;
		
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			
		}
		System.out.println("Largest Element of an Array"+max);

	}

}
