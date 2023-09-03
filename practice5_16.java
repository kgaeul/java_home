package kh.com.practice5;

import java.util.Scanner;

public class practice5_16 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		
		int n =sc.nextInt();
		
		String []names = new String[n];
		System.out.println("1번째 문자를 입력하세요 : ");
		names[0] =sc.next();
		System.out.println("2번째 문자를 입력하세요 : ");
		names[1] =sc.next();
		System.out.println("3번째 문자를 입력하세요 : ");
		names[2] =sc.next();
		
		
		System.out.println("더 값을 입력하시겠습니까?");
		String answer =sc.next();
		if(answer=="Y") {
			System.out.println("몇 개를 더 올리시겠습니까? :  ");
		}else if(answer=="N") {
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
		}else {
			
		}
	}

}
