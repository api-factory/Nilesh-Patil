import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertStringToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter a date");
		String str=s.nextLine();
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date date=format.parse(str);
			System.out.println("date after conversion "+date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
