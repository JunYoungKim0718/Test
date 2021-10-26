package com.naver.kesl718;

public class java211026 {

	public static void main(String[] args) {
		
		// 정수를 저장하는 변수 만들기
		int age = 26; // 정수는 int
		System.out.println(age); // 메소드는 ()를 사용하는 명령어
		
		/* 
		 * int age = 77; 한 클레스에 같은 이름의 변수를 사용할수 없다
		 * age = 70; 변경 가능
		 * age = 26.3; 변수를 만든 후 부여된 값을 변경하려면 변수에 등록 된 같은 종류의 데이터만 대입이 가능하다
		 */
		
		
		// 문자열을 저장하는 변수 만들기
		String name = "jun"; // 문자열은 String
		System.out.println(name);
		
		// 문자를 저장하는 변수 만들기
		char ch = 'H';
		System.out.println(ch);
		
		// 제어문 문자
		System.out.println("Hello\nJava"); // \n 기준으로 출력이 다음줄로 넘어간다
		
		// 실수를 저장하는 변수 만들기
		double age0 = 26.4;
		System.out.println(age0);
		System.out.println("나이는 " + age0 + "세");
		/*
		 * int age0 = 26.4 정수 변수에 실수를 입력불가
		 * double age0 = 26 신수 변수에 정수를 입력가능 = 26.0
		 */
		
		
		/* 
		 * 강제 형 변환
		 * 실수를 정수로 변경해서 대입
		 */
		int age1 = (int)26.4; // 26 - 소수는 제거됨
		System.out.println(age1);
		
		/*
		 * 표현범위 밖의 숫자를 강제로 변환해서 대입
		 * byte 는 -128 ~ 127까지 표현 가능
		 */
		byte B0 = 127;
		System.out.println(B0);
		byte B1 = (byte)128; // -128 - byte는 127까지 표현이 가능하다. 요구하는 수는 128이라 뒤로 넘어가 -128이 나온다(overflow : 가장 큰 쪽으로 넘어가 가장 작은 것부터 다시 시작)
		B1 = (byte)-130; // 126 - byte는 -128까지 표현이 가능하다. 요구하는 수는 -130이라 앞으로 넘어가 126이 나온다(underflow : 가장 작은 쪽으로 넘어가 가장 큰 것부터 다시 시작)
		System.out.println(B1); 
		
		
		
		
		
		
	}

}
