
public class LoginAfterUI {
	public static int index;
	public static boolean passLogin(User[] u,int userCount) {
		int choice;
			while(true) {
				System.out.println();
				System.out.println("���ϽŴ� ��ȣ�� ������ �ּ���");
				System.out.println("1. ����ܾ� �߰�");
				System.out.println("2. ����ܾ� ����");
				System.out.println("3. ������ ����ܾ��� ����");
				System.out.println("4. ���� �ܾ� ���躸��");
				System.out.println("5. �α���â���� ����");
				choice=FunctionMethod.ScanInt();
			
				if(choice==1) 
					u[userCount].addWord();
				
				else if(choice==2) 
					u[userCount].removeWord();
				
				else if(choice==3) 
					u[userCount].showWord();
			
				else if(choice==4) 
					u[userCount].testWord(u,userCount);
				
				else if(choice==5) 
					return false;
				
				else 
					System.out.println("1~5�� �� �Է����ּ���.");
			
			
			}	
		}

	}