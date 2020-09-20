import java.util.InputMismatchException;
import java.util.Scanner;

public class FunctionMethod {
	
	
	public static String ScanString() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				String str=scan.nextLine();
				return str;
			}
			catch(InputMismatchException e) {
				
			}
		}
	}
	
	
}
