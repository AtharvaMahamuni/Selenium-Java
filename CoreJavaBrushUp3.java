
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String is an object in Java
		
		String s1 = "Hello";
		String s2 = new String("Welcome");
		
		System.out.println(s1 + " " + s2);
		
		
		String s = "This is my random string to split into an array";
		
		String[] arr = s.split(" ");
		
		for(String word : arr) {
			System.out.println(word);
		}
	
		
		// Print character by character in reverse order -
		
		for(int i = s.length()-1; i > -1; i --) {
			System.out.print(s.charAt(i));
		}
		
		
	}

}
