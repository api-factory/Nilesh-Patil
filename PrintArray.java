import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		
		System.out.println("How many no you want to print as a array");
		int n=s.nextInt();
		
		int[] arr =new int[n];
		
		System.out.println("Enter "+n+" no.");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("You have provided below no.");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
