public class EngWordArray {
	
	
	public static void main(String[] args) {
		User[] u = new User[100];
		int userCount=0;
	
		while(true) {
			int choice,index;
			System.out.println("���ϽŴ� ��ȣ�� ������ �ּ���");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ����");
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
						System.out.println("ȸ���� ���� �� ���� ȸ������ �� �� �����ϴ�.");
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
					System.out.println("1~3�� �� �Է����ּ���.");
				}
		}
}
}

