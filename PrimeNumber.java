import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter any no to check wheather no is prime or not");
		int n=s.nextInt();
		
		int flag=0;

		for(int i=2;i<n;i++)
		{
			if((n%i)==0)
			{
				System.out.println("no is not prime");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("no is prime");
		}
		
		
	}

}
