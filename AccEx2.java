package basic4;

public class AccEx2 {

	// 필

	// 생

	// 메
	static void sunja1() {	// x,x
		System.out.println("사탕");
	}

	static void sunja2(String gift) {	// o,x
		System.out.println(gift);
	}

	static String sunja3() {	// x,o
		return "초콜릿";
	}

	static String sunja4(String gift2) {	// o,o
		System.out.println(gift2);
		return "탕후루";
	}

	public static void main(String[] args) {
		sunja1();
		System.out.println();
		
		sunja2("바나나");
		System.out.println();
		
		String gift = sunja3();
		System.out.println(gift);
		System.out.println();
		
		String gift2 = sunja4("마라탕");
		System.out.println(gift2);
		System.out.println("------------------");
		
		int arr[] = new int[] {90,80,70};
		double tot=0;
		double avg;
		for(int arrs : arr) {
			tot += arrs;
		}
		avg = tot /3 ;
		System.out.printf("총점 : %.2f, 평균 : %.2f" , tot, avg);
	}

}
