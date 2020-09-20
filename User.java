import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	private static String name;
	private static String id;
	private static String passWord;
	private String[] wordArray;
	
	public User(String id, String passWord, String name) {
		this.name=name;
		this.id=id;
		this.passWord=passWord;
		System.out.println(name+"�� ȸ�������� �����մϴ�.");
		
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return passWord;
	}
	
	@Override
	public String toString() {
		return (id+"/"+passWord+"/"+name);
	}
	
	public static String ScanString() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
				String str=scan.nextLine();
				return str;
				
		}
	}
	
	public static boolean CheckUser(User[] u) {
		String cid,cpassWord;
		int count=0;
		System.out.printf("ID�� �Է��ϼ���: ");
		cid=FunctionMethod.ScanString();
		System.out.printf("password�� �Է��ϼ���: ");
		cpassWord=FunctionMethod.ScanString();

		for(User e : u) {
			count++;
			if(e.getId()=="null" || e.getPassword()=="null") {
				return false;
			}
			else {
				if((e.getId().equals(cid)) &&( e.getPassword().equals(cpassWord))) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					return true;
				}
			}
		}
		if(count==100) {
			System.out.println("�Է��Ͻ� ID�� ȸ�����ԵǾ� ���� �ʰų�, �н����尡 Ʋ�Ƚ��ϴ�.");
			return false;
		}
		return false;
	}
	
	public static void MakeUser(User[] u,int userCount) {
		String cid,cpassWord,cname;
		System.out.println("ȸ�������� �����ϼ̽��ϴ�.");
		System.out.printf("ID�� �Է����ּ���: ");
		cid=FunctionMethod.ScanString();
		System.out.printf("PassWord�� �Է��� �ּ���: ");
		cpassWord=FunctionMethod.ScanString();
		System.out.printf("�̸��� �Է����ּ���: ");
		cname=FunctionMethod.ScanString();
		u[userCount] =new User(cid,cpassWord,cname);
		System.out.println("�α��� �Ǿ����ϴ�.");
	}
	
	
	
	
}
		

		
		


