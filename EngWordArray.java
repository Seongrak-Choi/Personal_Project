public class EngWordArray {
	
	
	public static void main(String[] args) {
		User[] u = new User[100];
		int userCount=0;
	
		while(true) {
			int choice,index;
			System.out.println("원하신는 번호를 선택해 주세요");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			choice=FunctionMethod.ScanInt();
				if(choice==1) {
					
					while(true) {
						index=User.CheckUser(u,userCount);
						if((index)>-1) {
							if(LoginAfterUI.passLogin(u, index)) {
							
							}
							else break;
							
							
						}
						else if(index<=0) break;	
					}
				}
					
				else if(choice==2) {
					if(userCount>99) {
						System.out.println("회원의 수가 다 차서 회원가입 할 수 없습니다.");
					}
					else {
						User.MakeUser(u, userCount);
						userCount++;
					}
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

