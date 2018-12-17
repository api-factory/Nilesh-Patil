import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter any no. to check wheather no. is Even or Odd");
		int n=s.nextInt();

		if(n%2==0)
		{
			System.out.println("no. is even");
		}
		else
		{
			System.out.println("no. is odd");
		}
	}

}
