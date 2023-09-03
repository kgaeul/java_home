package kh.com.practice5;

public class practice5_8 {

	public static void main(String[] args) {
		
		int[]num= {4,-4,3,-3,2};
		
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]);
		}
		
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println();
		System.out.println("총합은 "+sum+"입니다.");
	}

}
