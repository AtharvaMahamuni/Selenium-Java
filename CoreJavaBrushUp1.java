
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String myStr = "https://atharvamahamuni.github.io";
		char letter = 'r';
		double dec = 5.99;
		
		boolean myCart = true;
		
		System.out.println(myNum + " is the stored number");
		
		//Arrays -
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 6;
		
//		System.out.println(arr[0]+arr[1]);
		
		int[] arrNew = {1, 2, 5, 7, 6};
//		System.out.println(arrNew[0] + arrNew[1] + arrNew[4]);
		
		
		// Loop 
		for(int i = 0; i < 5; i++) {
//			System.out.println(arrNew[i]);
		}
		
		// for each loop
		for(int num : arrNew) {
			System.out.println(num);
		}
		
		
	}

}
