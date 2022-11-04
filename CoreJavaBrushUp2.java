import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		
		// Array List -
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Atharva");
		a.add("Mahamuni");
		a.add("Selenium");
		a.add("Tutorial");
		
		System.out.println(a.get(2));
		
	}

}
