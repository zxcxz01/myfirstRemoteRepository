package basic4;

public class Calc2 {

	public static void main(String[] args) {
//		Calc1 calc1 = new Calc1();
		
//		Calc1 calc2 = new Calc1(4,5);
//		Calc1 calc2 = new Calc1(4.0,5.0);
		
//		double  result = calc2.add();
//		System.out.println(result);
//		double  result = calc2.divide();
//		System.out.println(result);
		
		
//		int arrs[] = new int[3];
//		arrs[0]= 90;
//		arrs[1]= 80;
//		arrs[2]= 70;
//		int arrs[] = new int[] {90,80,70,60};
		
//		for(int arr : arrs) {			
//		System.out.println(arr);
//		}
		
		Calc1 calc2 = new Calc1(new int[] {90,80,70,60});
		
//		System.out.println(calc2);
//		System.out.println(calc2.arr);
//		System.out.println(calc2.arr[0]);
//		System.out.println(calc2.arr[1]);
//		System.out.println(calc2.arr[2]);
		
		int result = calc2.accu(new int[] {90,80,70,60});
		System.out.println(result);
		
//		double avg = (double)result / arrs.length;
//		System.out.println(avg);
		double avg = calc2.avg(new int[] {90,80,70,60});
		System.out.println(avg);
	}
}