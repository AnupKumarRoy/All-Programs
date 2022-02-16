package Day5;

public class Palindrome {

	public static void main(String[] args) {
		String word = "madam";
		String rev = "";
		for (int i = 4; i >=0; i--) {
			rev = rev+word.charAt(i);	
		}
		System.out.println(rev);
	if (word.equals(rev)) {
		System.out.println("It is a palindrome");
	}	else {
		System.out.println("It is a not palindrome");
	}
	
	}

}
