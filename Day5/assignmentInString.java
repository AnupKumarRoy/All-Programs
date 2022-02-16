package Day5;

public class assignmentInString {

	public static void main(String[] args) {
		String str3=new String("ANUP KUMAR ROY");
		String str4=new String("ANUP KUMAR ROY");
		
		int length = str3.length();
		System.out.println(str3.length());
		char[] charArray = str3.toCharArray();
		System.out.println(charArray);
		System.out.println(str3.charAt(5));
		System.out.println(str3.charAt(2));
		System.out.println(str3.contains("Mugun"));
	System.out.println(str3.indexOf('U'));
	System.out.println(str3.equals(str4));
	System.out.println(str3==str4);
	System.out.println(str3.equalsIgnoreCase(str4));
	
	
	}
}
