package basic4;

public class AccEx1 {

	public static void main(String[] args) {
		// 누적합
		// 1~10 누적
		int arr[]=new int[3];
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 70;
		
		int tot = 0;
		
		for (int i = 0; i < arr.length; i++) {
			tot = tot + arr[i];
		
//			for(int arrs : arr) {
//				tot = tot + arrs;
//			}
		}
		System.out.println(tot);
		
		double avg = (double) tot / arr.length;
		System.out.println(avg);
	}

}
