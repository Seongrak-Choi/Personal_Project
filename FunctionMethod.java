import java.util.InputMismatchException;
import java.util.Scanner;

public class FunctionMethod {
	
	
	public static String ScanString() {
		Scanner scan = new Scanner(System.in);
				String str=scan.next();
				return str;
				
			}
		
	
	
	
	public static int ScanInt() {
		Scanner scan=new Scanner(System.in);
		int num;
		while(true) {
			try 
			{
				num=scan.nextInt();
				return num;
			
			}
			catch(InputMismatchException e) 
			{
				System.out.println("����,���ڸ� �Է����ּ���.");
				scan.next();
			}
			
		}
	}
}
	
