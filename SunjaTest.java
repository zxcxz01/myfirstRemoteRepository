package basic4;

public class SunjaTest {

	
	// 필
	
	
	// 생
	
	
	// 메서드 정의 함 (메서드 정의가 되어 있어야 사용할 수 있으니 당연히 정의해야 함)
	
	// 메서드 이름(여러분이 적당하게 정해주시면 됨)을 쓴다.
	// 매개변수 X, O
	// return 값 X, O
	
	static void sunja1() {	// X, X
		System.out.println("안녕 순자님"); 	// 이것은 return이 아니고 단지 모니터에 print 할 뿐이다
	}
	static void sunja2(String gift) {	// O, X
		System.out.println(gift);
	}
	static String sunja3() {	// X, O
		return "사탕";
	}

	static String sunja4(String gift) {	// O, O
		System.out.println(gift);
		return "마라탕";
	}
	
	public static void main(String[] args) {

//		String gift = new String();
		
//		sunja1();
		
//		sunja2("초콜렛");
		
//		String gift2 = sunja3();
//		System.out.println(gift2);
		
		String lunch = sunja4("탕후루");
		System.out.println(lunch);
	}

}
