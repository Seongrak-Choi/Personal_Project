
public class LoginAfter {
	public static int index;
	public static boolean passLogin(User[] u,int i) {
		int choice,addindex = 0;
		index=i;
		while(true) {
			System.out.println("1. ����ܾ� �Է��ϱ�");
			System.out.println("2. ������ ����ܾ��� ����");
			System.out.println("3. ���� �ܾ� ���躸��");
			System.out.println("4. �α���â���� ����");
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
				System.out.println("1~4�� �� �Է����ּ���.");
			}
			
		}	
	}

}
