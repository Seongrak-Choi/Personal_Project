import java.util.Scanner;
import java.util.InputMismatchException;


public class EngWordArray {
	
	public static int ScanInt() {
		Scanner scan=new Scanner(System.in);
		while(true) {
		try {
			int num=scan.nextInt();
			return num;
		}
		catch(InputMismatchException e) 
		{
			System.out.println("1~3만 입력해주세요");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			scan.next();
			}
		}
	}
	

	
	
	
	public static void main(String[] args) {
		User[] u = new User[100];
		while(true) {
			int choice,userCount=0;
			String id;
			String passWord;
			String name;
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			choice=ScanInt();
				if(choice==1) {
					
					if(User.CheckUser(u)) {
						System.out.println("1. 영어단어 입력하기");
					}
					else{
						continue;
					}
				}
					
				else if(choice==2) {
					User.MakeUser(u, userCount);
				}
				else if(choice==3) {
					break;
				}
				else {
					System.out.println("1~3번 만 입력해주세요.");
				}
		}
}
}

