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
		System.out.println(name+"님 회원가입을 축하합니다.");
		
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
		System.out.printf("ID를 입력하세요: ");
		cid=FunctionMethod.ScanString();
		System.out.printf("password를 입력하세요: ");
		cpassWord=FunctionMethod.ScanString();

		for(User e : u) {
			count++;
			if(e.getId()=="null" || e.getPassword()=="null") {
				return false;
			}
			else {
				if((e.getId().equals(cid)) &&( e.getPassword().equals(cpassWord))) {
					System.out.println("로그인 되었습니다.");
					return true;
				}
			}
		}
		if(count==100) {
			System.out.println("입력하신 ID는 회원가입되어 있지 않거나, 패스워드가 틀렸습니다.");
			return false;
		}
		return false;
	}
	
	public static void MakeUser(User[] u,int userCount) {
		String cid,cpassWord,cname;
		System.out.println("회원가입을 선택하셨습니다.");
		System.out.printf("ID를 입력해주세요: ");
		cid=FunctionMethod.ScanString();
		System.out.printf("PassWord를 입력해 주세요: ");
		cpassWord=FunctionMethod.ScanString();
		System.out.printf("이름을 입력해주세요: ");
		cname=FunctionMethod.ScanString();
		u[userCount] =new User(cid,cpassWord,cname);
		System.out.println("로그인 되었습니다.");
	}
	
	
	
	
}
		

		
		


