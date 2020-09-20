import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	private String name,id,passWord;
	private String[] wordArray;
	
	public User(String id, String passWord, String name) {
		this.name=name;
		this.id=id;
		this.passWord=passWord;
		System.out.println(this.name+"님 회원가입을 축하합니다.");
		
	}
	
	@Override
	public String toString() {
		return (id+"/"+passWord+"/"+name);
	}
	
	public static String ScanString() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
				String str=scan.nextLine();
				return str;
				
		}
	}
	
	public boolean CheckUser(String id,String passWord) {
		return this.id.equals(id)&&this.passWord.equals(passWord);
	
	}
}
		

		
		


