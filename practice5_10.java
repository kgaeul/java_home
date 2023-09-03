package kh.com.practice5;

import java.util.Scanner;

public class practice5_10 {

	public static void main(String[] args) {

		
		String[]numArray= {"1","2","3","4","5","6","-","1","2","3","4","5","6","7"};
		
		numArray[8]="*";
		numArray[9]="*";
		numArray[10]="*";
		numArray[11]="*";
		numArray[12]="*";
		numArray[13]="*";
		
		for(int i=0;i<numArray.length;i++) {
		System.out.print(numArray[i]);
		
		
		}
	}

}
