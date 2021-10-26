// 보라색 글자는 키워드
package com.naver.kesl718;

public class First211025 {

	public static void main(String[] args) {

// 파란색 글자는 상수
		System.out.println("Hello World");
		System.out.println("15");
		
// print 뒤에 나오는 메세지는 줄바꿈이 없이 출력된다
		System.out.print(777);
		System.out.println(555);  // 777555
		
// ""가 들어가면 문자열로 인식한다
		System.out.println("10"+10);  // 1010
		
		int a = 10; // 이름이 데이터(숫자가 1개 있을떄, Value Type)
		int [] ar = {100, 200, 300}; // 이름은 데이터를 대표한다 (숫자가 0개 이상 있을때, Reference Type)
		System.out.println(a);
		System.out.println(ar); // [I@7d6f77cc (대표 숫자가 정해져 있지 않다)
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		
	}

}
