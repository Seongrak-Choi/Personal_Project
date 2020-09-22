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
		return (this.id+"/"+this.passWord+"/"+this.name);
	}
	
	public static int CheckUser(User[] u,int userCount) {
		String inid,inpassWord,cid,cpassWord;
		System.out.println(userCount);
		System.out.printf("ID�� �Է��ϼ���(q �Է½� �ڷ�): ");
		inid=FunctionMethod.ScanString();
		if(inid.equals("q")) return -1;
		System.out.printf("password�� �Է��ϼ���: ");
		inpassWord=FunctionMethod.ScanString();

		for(int i=0;i<userCount;i++) {
				cid=u[i].getId();
				cpassWord=u[i].getPassword();
				if((cid.equals(inid)) &&( cpassWord.equals(inpassWord))) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					return i;
				}
			}
		System.out.println("ID�� ���ų�, password�� ��ġ���� �ʽ��ϴ�.");
		return -1;
		}
	

	


	
	public static void MakeUser(User[] u,int userCount) {
		String inid,inpassWord,inname;
		System.out.println("ȸ�������� �����ϼ̽��ϴ�.");
		System.out.printf("ID�� �Է����ּ���: ");
		inid=FunctionMethod.ScanString();
		System.out.printf("PassWord�� �Է��� �ּ���: ");
		inpassWord=FunctionMethod.ScanString();
		System.out.printf("�̸��� �Է����ּ���: ");
		inname=FunctionMethod.ScanString();
		u[userCount] =new User(inid,inpassWord,inname);
		
	}
	
	public int addWord(int addindex) {
		String word,meaning;
		int i=addindex,choice;
		
		while(true) {
			System.out.println("1. �ܾ��߰�");
			System.out.println("2. ����");
			choice=FunctionMethod.ScanInt();
			if(choice==1) {
			
				System.out.printf("����(���縵): ");
					word=FunctionMethod.ScanString();
					wordArray[i]=word;
					System.out.println("");
					System.out.printf("�ѱ�(��): ");
					meaning=FunctionMethod.ScanString();
					meaningArray[i]=meaning;
					i++;

			}
			else if(choice==2) {
				return i;
			}
			else {
				System.out.println("1~2���� �Է��ϼ���");
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
		

		
		


