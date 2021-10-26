package com.naver.kesl718;

public class Unary211026 {

	public static void main(String[] args) {
		
		int n = 10;
		// ~은 1의 보수 - 보후는 반대가 되고 절대값은 1이 증가하거나 감소
		// 그래픽 프로그램에서 색상 반전에 이용
		System.out.println("~n: " + ~n); // ~n: -11
		
		// !(not이라 읽는다) - boolean 데이터 반전
		boolean t = true;
		System.out.println("!t: " + !t); // !t: false
		
		// --는 1감소, ++는 1증가
		n = 10;
		n++;
		System.out.println("n: " + n); // n: 11
		
		
		// ++ or --가 뒤에 붙으면 ++ or --를 하지 않고 먼저 출력후 나중에 실행한다
		n = 10;
	    System.out.println("n++: " + (n++)); // n++: 10
	    System.out.println(n); // 11
	    
	    // ++ or --가 앞에 붙으면 ++ or --를 먼저 출력한다
	    n = 10;
	    System.out.println("++n: " + (++n)); // ++n: 11
	    
	    n = 0;       //1   //2
	    int result = ++n + ++n;
	    System.out.println("result: " + result); // result: 3
	    
	    // 정수 사이의 연산이므로 결과는 3
	    result = 10 / 3;
	    System.out.println("result: " + result); //result: 3
	    
	    // 실수를 얻기 위해서는 두 데이터중 하나를 실수로 변경한다
	    result = 10;
	    System.out.println("result: " + result/(double)3); // result: 3.3333333333333335
	    
	    
	    // 산술 연산을 하면 연산의 결과는 최소한 int다
	    // byte는 int보다 작으므로 대입이 안된다
	    byte b = 30;
	    byte c = 20;
	    //byte d = b + c; - 오류
	    byte d = (byte)(b + c);
	    System.out.println("d: " + d); //d: 50
	    // 숫자 데이터에서 원하는 결과를 얻고자 할 때는 강제 형 변환을 이용하면 된다
	   

	    

	}

}
