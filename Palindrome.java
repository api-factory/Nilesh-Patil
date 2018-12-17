import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter any no. to check wheather no. is Palindrome or not");
		int n=s.nextInt();
		
		  int k,t=0,temp;    
		  
		  temp=n;    
		  while(n>0)
		  {    
			   k=n%10;  
			   t=(t*10)+k;    
			   n=n/10;    
		  }    
		  if(temp==t)  
		  {
			  System.out.println("palindrome number ");
		  }
		  else
		  {
			  System.out.println("not palindrome");
		  }
	}

}
