
public class LoginAfter {
	public static int index;
	public static boolean passLogin(User[] u,int i) {
		int choice,addindex = 0;
		index=i;
		while(true) {
			System.out.println("1. 영어단어 입력하기");
			System.out.println("2. 나만의 영어단어장 보기");
			System.out.println("3. 영어 단어 시험보기");
			System.out.println("4. 로그인창으로 가기");
			choice=FunctionMethod.ScanInt();
			
			if(choice==1) {
				addindex=u[i].addWord(addindex);
			}
			else if(choice==2) {
				u[i].showWord();
			}
			else if(choice==3) {
				u[i].testWord();
			}
			else if(choice==4) {
			return false;
			}
			else {
				System.out.println("1~4번 만 입력해주세요.");
			}
			
		}	
	}

}
