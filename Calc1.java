package basic4;

public class Calc1 {

	// 필
	double num1;
	double num2;
	int arr[];

	// 생 : 객체 초기화
	public Calc1() {

	}

	public Calc1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Calc1(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

//	public Calc1(int[] arr) {
//		this.arr = arr;
//	}

	Calc1(int arr[]) {
		this.arr = arr;
	}
	
	
	// 메서드(함수) 누적해라!!!, 동사는 기능(함수)을 가지고 있어야 함

	double add() {
		return this.num1 + this.num2;
	}

	double divide() {
		return this.num1 / this.num2;
	}
	
	int accu(int arr[]) {
		this.arr=arr;
		
		int tot = 0;
		for(int i = 0;i<arr.length;i++) {
			tot += arr[i];
		}
		return tot;
	}
	
	double avg(int arr[]) {
		int tot = accu(arr);		
		return (double)tot / arr.length;
	}
	
}
