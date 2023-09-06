package basic4;

import java.util.Scanner;

public class Ex {

	double num1 = 0; 
	double result = 0;

	static double fistcal(double num1, double result) {
		return result;
	}
	static double cal(double num1, double result) {
		return result;
	}

	public static void main(String[] args) {

		// 주석 테스트		
		Scanner sc = new Scanner(System.in);
		Scanner op = new Scanner(System.in);
		String operater = "";
		double n1;
		double sum = 0;
		
		
		// 첫 연산
		
		System.out.print("> ");
		n1 = sc.nextDouble();
		System.out.print("연산자 ");
		operater = op.nextLine();
		System.out.print("> ");
		n1 = sc.nextInt();
		
		if(operater.equals("+")) {
			sum = n1 + n1;
			double result1 = fistcal(n1, sum);
			System.out.println("= " + result1);	
		} else if(operater.equals("-")) {
			sum = n1 - n1;
			double result1 = fistcal(n1, sum);
			System.out.println("= " + result1);	
			
		} else if(operater.equals("*")) {
			sum = n1 * n1;
			double result1 = fistcal(n1, sum);
			System.out.println("= " + result1);	
			
		} else if(operater.equals("/")) {
			sum = n1 / n1;
			double result1 = fistcal(n1, sum);
			System.out.println("= " + result1);		
			
		} else if (!operater.equals("0")){
			System.out.print("계산 완료");
		} else if (n1 != 0){
			System.out.print("계산 완료");
			
		} else {
			System.out.println("다시 입력");
		}
		
		// 두 번째 연산부터 누적
		do {
			System.out.print("연산자 ");
			operater = op.nextLine();
			
			System.out.print("> ");
			n1 = sc.nextDouble();
			
			if(operater.equals("+")) {
				sum += n1;
				double result1 = cal(n1, sum);
				System.out.println("= " + result1);	
				
			} else if(operater.equals("-")) {
				sum -= n1;
				double result1 = cal(n1, sum); 
				System.out.println("= " + result1);	
				
			} else if(operater.equals("*")) {
				sum *= n1;
				double result1 = cal(n1, sum);
				System.out.println("= " + result1);	
				
			} else if(operater.equals("/")) {
				sum /= n1;
				double result1 = cal(n1, sum);
				System.out.println("= " + result1);				
			} else if(!operater.equals("+") 
					|| !operater.equals("-")
					|| !operater.equals("*")
					|| !operater.equals("/")){
				System.out.println("다시 입력");
			} else {
				System.out.println("계산완료");
			}
		} while (n1 != 0 || !operater.equals("q"));
		
		sc.close();
		op.close();
	}

}
