
public class LoginAfterUI {
	public static int index;
	public static boolean passLogin(User[] u,int i) {
		int choice;
			while(true) {
				System.out.println();
				System.out.println("원하신는 번호를 선택해 주세요");
				System.out.println("1. 영어단어 추가");
				System.out.println("2. 영어단어 삭제");
				System.out.println("3. 나만의 영어단어장 보기");
				System.out.println("4. 영어 단어 시험보기");
				System.out.println("5. 로그인창으로 가기");
				choice=FunctionMethod.ScanInt();
			
				if(choice==1) 
					u[i].addWord();
				
				else if(choice==2) 
					u[i].removeWord();
				
				else if(choice==3) 
					u[i].showWord();
			
				else if(choice==4) 
					u[i].testWord(u,i);
				
				else if(choice==5) 
					return false;
				
				else 
					System.out.println("1~4번 만 입력해주세요.");
			
			
			}	
		}

	}