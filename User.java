import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class User {
	private String name;
	private String id;
	private String passWord;
	private String[] wordArray = new String[100];
	private String[] meaningArray = new String[100];
	
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
		return (this.id+"/"+this.passWord+"/"+this.name);
	}
	
	public static int CheckUser(User[] u,int userCount) {
		String inid,inpassWord,cid,cpassWord;
		System.out.println(userCount);
		System.out.printf("ID를 입력하세요(q 입력시 뒤로): ");
		inid=FunctionMethod.ScanString();
		if(inid.equals("q")) return -1;
		System.out.printf("password를 입력하세요: ");
		inpassWord=FunctionMethod.ScanString();

		for(int i=0;i<userCount;i++) {
				cid=u[i].getId();
				cpassWord=u[i].getPassword();
				if((cid.equals(inid)) &&( cpassWord.equals(inpassWord))) {
					System.out.println("로그인 되었습니다.");
					return i;
				}
			}
		System.out.println("ID가 없거나, password가 일치하지 않습니다.");
		return -1;
		}
	

	


	
	public static void MakeUser(User[] u,int userCount) {
		String inid,inpassWord,inname;
		System.out.println("회원가입을 선택하셨습니다.");
		System.out.printf("ID를 입력해주세요: ");
		inid=FunctionMethod.ScanString();
		System.out.printf("PassWord를 입력해 주세요: ");
		inpassWord=FunctionMethod.ScanString();
		System.out.printf("이름을 입력해주세요: ");
		inname=FunctionMethod.ScanString();
		u[userCount] =new User(inid,inpassWord,inname);
		
	}
	
	public int addWord(int addindex) {
		String word,meaning;
		int i=addindex,choice;
		
		while(true) {
			System.out.println("1. 단어추가");
			System.out.println("2. 종료");
			choice=FunctionMethod.ScanInt();
			if(choice==1) {
			
				System.out.printf("영어(스펠링): ");
					word=FunctionMethod.ScanString();
					wordArray[i]=word;
					System.out.println("");
					System.out.printf("한글(뜻): ");
					meaning=FunctionMethod.ScanString();
					meaningArray[i]=meaning;
					i++;

			}
			else if(choice==2) {
				return i;
			}
			else {
				System.out.println("1~2번만 입력하세요");
			}
		}
		
	}
	
	public void showWord() {
		System.out.println();
		for(int i=0;i<this.wordArray.length;i++) {
			if(wordArray[i]==null)continue;
			System.out.println(wordArray[i]+" "+ meaningArray[i]);
			//System.out.println();
		}
	}
	
	public void testWord() {
		Random rand = new Random(System.currentTimeMillis());
		System.out.println();
		for(int i=0;i<this.wordArray.length;i++) {
			if(wordArray[i]==null) continue;
			else {
			System.out.printf(wordArray[i]+"   ");
			}
			
		}
	}
	
}
		

		
		


