import java.util.Scanner;
import java.util.InputMismatchException;


public class EngWordArray {
	
	
	public static void main(String[] args) {
		User[] u = new User[100];
		int userCount=0;
	
		while(true) {
			int choice,index;
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			choice=FunctionMethod.ScanInt();
				if(choice==1) {
					
					while(true) {
						index=User.CheckUser(u,userCount);
						if((index)>-1) {
							if(LoginAfter.passLogin(u,index)) {
							
							}
							else break;
							
							
						}
						else if(index<=0) break;
						
						else continue;
						
					}
				}
					
				else if(choice==2) {
					User.MakeUser(u, userCount);
					userCount++;
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

