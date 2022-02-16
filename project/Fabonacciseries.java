package project;

public class Fabonacciseries {

	public static void main(String[] args) {
		int firNum = 0;
		int secNum = 1;
		int sum = 0;
		int range = 8;
		System.out.println(firNum);
		for (int  i= 1; i <=range; i++) {
			firNum = secNum ;
			secNum=sum;
			sum=firNum+secNum;
			System.out.println(sum);
			
		}

	}

}
