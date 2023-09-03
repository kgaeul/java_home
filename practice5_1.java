package kh.com.practice5;

import java.util.Scanner;

public class practice5_1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n= sc.nextInt();
	
	
		int []number=new int[n];
		
		
		for(int i=0 ;i<number.length;i++) {
			number[i]=i+1;
			System.out.print( "");
			System.out.print(number[i]);
			}
			
		
			
	}

}
