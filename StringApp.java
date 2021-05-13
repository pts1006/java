public class StringApp {

	public static void main(String[] args) {
		System.out.println("hello World");
		System.out.println('H');
		System.out.println("H");
		
		System.out.println("Hello "
				+ "World"); // 줄바꿈이 안 됨. Hello 라는 문자열과 World 라는 문자열을 결합시켜 준 것에 불과함.
		
		System.out.println("Hello \nWorld"); // \n 는 "줄바꿈을 해라!" 라는 특수한 명령식. (new line)
		
		
		// 그러면, < Hello "World" > 라는 문자열을 쓰고 싶으면 어떻게 하느냐. 
		System.out.println("Hello \"World\"");
		// 이렇게 역슬래쉬를 따옴표 앞에 써 넣으면, 따옴표를 포함한 그 뒤에 속하는 글자들은 <평범한 문자열>이 되는 것.
	}

}
