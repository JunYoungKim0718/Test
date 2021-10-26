package com.naver.kesl718;

public class Logical211026 {

	public static void main(String[] args) {
		
		System.out.println(10>3);
		
		// year 가 윤년인지 판별
		// year 가 4의 배수이고 100의 배수가 아니면 윤년
		// 또는 400의 배수인 경우
		int year = 20021;
		boolean pan = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if(pan == true) {
			System.out.println("year는 윤년" );
		}else {
			System.out.println("year는 윤년이 아님" );
		}

//	int x = 10;
//	boolean r = x > 5 && x++ > 10;
//	System.out.println(x);
//	
//	x = 10;
//	r = x < 5 && x++ > 10;
//	System.out.println(x);
//		
	}

}
