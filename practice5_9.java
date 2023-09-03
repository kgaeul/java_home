package kh.com.practice5;

import java.util.Scanner;

public class practice5_9 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("치킨 메뉴를 입력해주세요 : ");
		String menu = sc.next();
		
		String chicken = "양념";
		char[]chickenmenu= chicken.toCharArray();
		
		char[]charmenu= menu.toCharArray();
		
		int count=0;
		for(int i=0;i<charmenu.length;i++){
			if(charmenu[i] == chickenmenu[i]) {
				count++;
			}
		} 
		
		if(count>1) {
			System.out.println("양념치킨 배달가능");
		}else {
			System.out.println(menu+"은 주문 불가능한 메뉴입니다.");
		}
	}

}//숙제 전부 구글링 하나두 안하고 했는데 넘 어려워써요...ㅠㅠ
