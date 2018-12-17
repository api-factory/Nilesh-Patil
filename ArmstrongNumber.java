import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter any no. to check wheather no. is armstrong or not");
		int n=s.nextInt();
		
		  int k,t=0,temp;    
		  
		  temp=n;    
		  while(n>0)
		  {    
			   k=n%10;  
			   n=n/10; 
			   t=(k*k*k)+t;    
			      
		  }    
		  if(temp==t)  
		  {
			  System.out.println("armstrong number ");
		  }
		  else
		  {
			  System.out.println("not armstrong");
		  }

	}

}
