package WeekDay2;

public class CharaterOccurance {

	public static void main(String[] args) {
	String input = "welcome to Salem";
	String replace=input.replace("e","");
	System.out.println(input);
	System.out.println("No of e is"+" "+(input.length()-replace.length()));
	

	}

}
