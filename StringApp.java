
public class StringApp {

	public static void main(String[] args) {
		//Character vs String
		System.out.println("Hello World"); //String(문자열)
		System.out.println('H'); //Character(문자,한 글자)
		System.out.println("H");
		
		System.out.println("Hello"
				+ " World"); //엔터시 이클립스가 자동으로 제공
		//new line
		System.out.println("Hello \nWorld");
		
		//escape
		//System.out.println("Hello "World""); //error, "는 문자열의 시작과 끝
		System.out.println("Hello \"World\""); //역슬래시를 통해 뒤에 책임져야 될 임무를 일시적으로 해방
	}

}
