import java.util.InputMismatchException;
import java.util.Scanner;

public class FunctionMethod {
	
	
	public static String ScanString() {
		Scanner scan = new Scanner(System.in);
				String str=scan.nextLine();
				return str;
				
			}
		
	
	
	
	public static int ScanInt() {
		Scanner scan=new Scanner(System.in);
		while(true) {
		try {
			int num=scan.nextInt();
			return num;
		}
		catch(InputMismatchException e) 
		{
			System.out.println("����,���ڸ� �Է����ּ���.");
			scan.nextInt();
			}
		}
	}
	
	
}
