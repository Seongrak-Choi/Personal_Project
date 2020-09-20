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
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ����");
			choice=ScanInt();
				if(choice==1) {
					System.out.printf("ID�� �Է��ϼ���: ");
					id=ScanString();
					System.out.printf("password�� �Է��ϼ���: ");
					passWord=ScanString();
					System.out.println(u[0].CheckUser(id, passWord));
					for(int i=0;i<100;i++) {
						if(u[i].CheckUser(id, passWord)) {
							System.out.println("�α��� �Ǿ����ϴ�.");
							break;
						}
						else {
							System.out.println("�Է��Ͻ� ������ ���� ID�̰ų� �н����尡 ��ġ���� �ʽ��ϴ�.");
						}
					
					}
					
				}
				else if(choice==2) {
					System.out.println("ȸ�������� �����ϼ̽��ϴ�.");
					System.out.printf("ID�� �Է����ּ���: ");
					id=(ScanString());
					System.out.printf("PassWord�� �Է��� �ּ���: ");
					passWord=ScanString();
					System.out.printf("�̸��� �Է����ּ���: ");
					name=ScanString();
					u[userCount]=new User(id,passWord,name);
					
					
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

