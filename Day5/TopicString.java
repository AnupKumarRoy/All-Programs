package Day5;

public class TopicString {
	public int add() {
		int x=2;
		int y=20;
		int z=x+y;
		return z;
	}
	
	public String getMobileBrand(String type) {
		return type;
	}
public static void main(String[] args) {
TopicString str= new TopicString();
str.add();
str.getMobileBrand("realme");
System.out.println(str.add());

}
}



