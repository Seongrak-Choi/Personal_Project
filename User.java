//import java.util.InputMismatchException;
//import java.util.Scanner;
public class User {
	private String name;
	private String id;
	private String passWord;
	private int wordIndex=0;
	private String[] wordArray = new String[100];
	private String[] meaningArray = new String[100];
	
	public User(String id, String passWord, String name) { //UserŬ���� ������
		this.name=name;
		this.id=id;
		this.passWord=passWord;
		
		System.out.println(name+"�� ȸ�������� �����մϴ�.");
		System.out.println();
				
	}
	public String getId() { 
		return id;
	}
	public String getPassword() {
		return passWord;
	}
	public String getName() {
		return name;
	}
	
	public static int CheckUser(User[] u,int userCount) { //�α��ν� �Է¹��� �����͸� Ȯ���ϴ� �޼ҵ�
		String inid,inpassWord,cid,cpassWord;
		System.out.printf("ID�� �Է��ϼ���(q �Է½� �ڷ�): ");
		inid=FunctionMethod.ScanString();
		if(inid.equals("q")) return -1;
		System.out.printf("password�� �Է��ϼ���: ");
		inpassWord=FunctionMethod.ScanString();

		for(int i=0;i<userCount;i++) {
				cid=u[i].getId();
				cpassWord=u[i].getPassword();
				if((cid.equals(inid)) &&( cpassWord.equals(inpassWord))) {
					System.out.println(u[i].getName()+"�� �α��� �Ǿ����ϴ�.");
					return i;
				}
			}
		System.out.println("ID�� ���ų�, password�� ��ġ���� �ʽ��ϴ�.");
		return -1;
		}
	

	


	
	public static void MakeUser(User[] u,int userCount) { //������ �����ϱ� ���� �޼ҵ�
		String inid,inpassWord,inname;
		int i;
		System.out.println("ȸ�������� �����ϼ̽��ϴ�.");
		while(true) {
			System.out.printf("ID�� �Է����ּ���: ");
			inid=FunctionMethod.ScanString();
			for(i=0;i<userCount;i++) {
				if(inid.equals(u[i].getId())) {
					System.out.println("�ߺ��� ID�Դϴ�.");
					break;
				}
			}
			
			if(userCount==i) {
				System.out.printf("PassWord�� �Է��� �ּ���: ");
				inpassWord=FunctionMethod.ScanString();
				System.out.printf("�̸��� �Է����ּ���: ");
				inname=FunctionMethod.ScanString();
				u[userCount] =new User(inid,inpassWord,inname);
				break;
			}
		
		}
	}

	public void addWord() { //wordArray�迭�� �ܾ� �߰��ϴ� �޼ҵ�
		String word,meaning;
		System.out.printf("����(���縵): ");
		word=FunctionMethod.ScanString();
		wordArray[wordIndex]=word;
		System.out.printf("�ѱ�(��): ");
		meaning=FunctionMethod.ScanString();
		meaningArray[wordIndex]=meaning;
		wordIndex++;
		System.out.println();
		}
	
	public void showWord() { //wordArray�迭�� ����Ǿ��ִ� �ܾ���� �����ִ� �޼ҵ�
		int count=0;
		System.out.println();
		for(int i=0;i<this.wordArray.length;i++) {
			if(wordArray[i]==null)continue;
			System.out.println((i+1)+". "+wordArray[i]+": "+ meaningArray[i]);
			count++;
		}
		System.out.println("�ܾ����� �� �ܾ� ������: "+count);
	}
	
	public void testWord(User[] u,int i) { //wordArray�迭�� ����Ǿ��ִ� �ܾ��� �����ְ� �ƹ����̳� �Է½� ���� �ε����� meaningArray�� �����ִ� �޼ҵ� 
		int r;
		String inWord,pause;
		String[] exampleArray=new String[4];
		System.out.println();
		for(int j=0;j<this.wordIndex;j++) {
			r=(int)(Math.random()*wordIndex);
			System.out.print((j+1)+". "+wordArray[r]+"�� ����?(����ġ�� ���� ���ɴϴ�.)");
			pause=FunctionMethod.ScanString(); //�ٷ� ���� �ߴ� ���� �������� �Է��� �޴´�
			System.out.println(meaningArray[r]);
			}
			
			
		}
	public void removeWord() { //wordArray�迭�� ����Ǿ��ִ� �ܾ���� ������ �� ����ϴ� �޼ҵ�
		int wordNo;
		System.out.println("�����ϰ� ���� �ܾ��� ��ȣ�� �Է��ϼ���: ");
		while(true) {
			wordNo=FunctionMethod.ScanInt();
			if(wordNo>wordIndex) {
				System.out.println("�ܾ��� ���� ���� ���� ���ڸ� �Է��Ͽ����ϴ�.");
			}
			else if(wordNo<1) {
				System.out.println("1���� ���� ���� �Է� �� �� �����ϴ�.");
			}
			else {
				for(int i=wordNo;i<wordIndex;i++) {
					this.wordArray[i-1]=this.wordArray[i];
					this.meaningArray[i-1]=this.meaningArray[i];
				}
				this.wordArray[wordIndex-1]=null;
				this.meaningArray[wordIndex-1]=null;
				wordIndex--;
				break;
			}
		}
	}
}
	

		

		
		


