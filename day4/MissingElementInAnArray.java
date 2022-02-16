package day4;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int [] mNum= {1,2,3,4,5,6,8};
		Array.sort(mNum);
		for (int i = 0; i <= mNum.length; i++) {
			if(i+1!=mNum[i]) {
				System.out.println(i+1);
				break;
				
			}
			
		}
	}

}