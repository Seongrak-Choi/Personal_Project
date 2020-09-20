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

	
	public static void main(String[] args) {
		User u[] = new User[100];
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
					System.out.printf("ID를 입력하세요: ");
					id=ScanString();
					System.out.printf("password를 입력하세요: ");
					passWord=ScanString();
					System.out.println(u[0].CheckUser(id, passWord));
					for(int i=0;i<100;i++) {
						if(u[i].CheckUser(id, passWord)) {
							System.out.println("로그인 되었습니다.");
							break;
						}
						else {
							System.out.println("입력하신 정보는 없는 ID이거나 패스워드가 일치하지 않습니다.");
						}
					
					}
					
				}
				else if(choice==2) {
					System.out.println("회원가입을 선택하셨습니다.");
					System.out.printf("ID를 입력해주세요: ");
					id=(ScanString());
					System.out.printf("PassWord를 입력해 주세요: ");
					passWord=ScanString();
					System.out.printf("이름을 입력해주세요: ");
					name=ScanString();
					u[userCount]=new User(id,passWord,name);
					
					
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

