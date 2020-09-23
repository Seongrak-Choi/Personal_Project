//import java.util.InputMismatchException;
//import java.util.Scanner;
public class User {
	private String name;
	private String id;
	private String passWord;
	private int wordIndex=0;
	private String[] wordArray = new String[100];
	private String[] meaningArray = new String[100];
	
	public User(String id, String passWord, String name) { //User클래스 생성자
		this.name=name;
		this.id=id;
		this.passWord=passWord;
		
		System.out.println(name+"님 회원가입을 축하합니다.");
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
	
	public static int CheckUser(User[] u,int userCount) { //로그인시 입력받은 데이터를 확인하는 메소드
		String inid,inpassWord,cid,cpassWord;
		System.out.printf("ID를 입력하세요(q 입력시 뒤로): ");
		inid=FunctionMethod.ScanString();
		if(inid.equals("q")) return -1;
		System.out.printf("password를 입력하세요: ");
		inpassWord=FunctionMethod.ScanString();

		for(int i=0;i<userCount;i++) {
				cid=u[i].getId();
				cpassWord=u[i].getPassword();
				if((cid.equals(inid)) &&( cpassWord.equals(inpassWord))) {
					System.out.println(u[i].getName()+"님 로그인 되었습니다.");
					return i;
				}
			}
		System.out.println("ID가 없거나, password가 일치하지 않습니다.");
		return -1;
		}
	

	


	
	public static void MakeUser(User[] u,int userCount) { //유저를 생성하기 위한 메소드
		String inid,inpassWord,inname;
		int i;
		System.out.println("회원가입을 선택하셨습니다.");
		while(true) {
			System.out.printf("ID를 입력해주세요: ");
			inid=FunctionMethod.ScanString();
			for(i=0;i<userCount;i++) {
				if(inid.equals(u[i].getId())) {
					System.out.println("중복된 ID입니다.");
					break;
				}
			}
			
			if(userCount==i) {
				System.out.printf("PassWord를 입력해 주세요: ");
				inpassWord=FunctionMethod.ScanString();
				System.out.printf("이름을 입력해주세요: ");
				inname=FunctionMethod.ScanString();
				u[userCount] =new User(inid,inpassWord,inname);
				break;
			}
		
		}
	}

	public void addWord() { //wordArray배열에 단어 추가하는 메소드
		String word,meaning;
		System.out.printf("영어(스펠링): ");
		word=FunctionMethod.ScanString();
		wordArray[wordIndex]=word;
		System.out.printf("한글(뜻): ");
		meaning=FunctionMethod.ScanString();
		meaningArray[wordIndex]=meaning;
		wordIndex++;
		System.out.println();
		}
	
	public void showWord() { //wordArray배열에 저장되어있는 단어들을 보여주는 메소드
		int count=0;
		System.out.println();
		for(int i=0;i<this.wordArray.length;i++) {
			if(wordArray[i]==null)continue;
			System.out.println((i+1)+". "+wordArray[i]+": "+ meaningArray[i]);
			count++;
		}
		System.out.println("단어장의 총 단어 개수는: "+count);
	}
	
	public void testWord(User[] u,int i) { //wordArray배열에 저장되어있는 단어을 보여주고 아무값이나 입력시 같은 인덱스의 meaningArray를 보여주는 메소드 
		int r;
		String inWord,pause;
		String[] exampleArray=new String[4];
		System.out.println();
		for(int j=0;j<this.wordIndex;j++) {
			r=(int)(Math.random()*wordIndex);
			System.out.print((j+1)+". "+wordArray[r]+"의 뜻은?(엔터치면 뜻이 나옵니다.)");
			pause=FunctionMethod.ScanString(); //바로 뜻이 뜨는 것을 막기위해 입력을 받는다
			System.out.println(meaningArray[r]);
			}
			
			
		}
	public void removeWord() { //wordArray배열에 저장되어있는 단어들을 삭제할 때 사용하는 메소드
		int wordNo;
		System.out.println("삭제하고 싶은 단어의 번호를 입력하세요: ");
		while(true) {
			wordNo=FunctionMethod.ScanInt();
			if(wordNo>wordIndex) {
				System.out.println("단어의 개수 보다 높은 숫자를 입력하였습니다.");
			}
			else if(wordNo<1) {
				System.out.println("1보다 작은 값은 입력 할 수 없습니다.");
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
	

		

		
		


