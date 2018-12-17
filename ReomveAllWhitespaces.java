import java.util.Scanner;

public class ReomveAllWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter a sentence");
		String str=s.nextLine();
		
		str=str.replaceAll(" ", "");
		
		System.out.println("Sentence after removing whitespaces "+"'"+str+"'");

	}

}
