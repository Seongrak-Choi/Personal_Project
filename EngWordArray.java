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
			System.out.println("1~3�� �Է����ּ���");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ����");
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
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ����");
			choice=ScanInt();
				if(choice==1) {
					
					if(User.CheckUser(u)) {
						System.out.println("1. ����ܾ� �Է��ϱ�");
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
					System.out.println("1~3�� �� �Է����ּ���.");
				}
		}
}
}

