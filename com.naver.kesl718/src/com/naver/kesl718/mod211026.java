package com.naver.kesl718;

public class mod211026 {

	public static void main(String[] args) {
		
		// 7가지 동작을 1초마다 수행하기
//		int k = 0;
//		while(true) {
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {}
//			// 7로 나눈 나머지 0,1,3,4,5,6
//			int mod = k % 7;
//			if(mod == 0) {System.out.println("일");}
//			if(mod == 1) {System.out.println("월");}
//			if(mod == 2) {System.out.println("화");}
//			if(mod == 3) {System.out.println("수");}
//			if(mod == 4) {System.out.println("목");}
//			if(mod == 5) {System.out.println("금");}
//			if(mod == 6) {System.out.println("토");}
//			k++;
//		}
		
		// 문제 : d 값을 소수 첫째 자리에서 반올림해서 저장하라
		double d = 10.7;
		int result0 = (int) (d+0.5); // 답 : 0.5를 d에 더하고 int로 형변환을 시키면 반올림이 된다
		System.out.println(result0);
		
		// 문제 : 소수 두째 자리 반올림 해서 출력 - 10.8
		d = 10.77;
		System.out.println((int)(d * 10 + 0.5) / 10.0);
		
		// 문제 : 10의 자리에서 반올림해서 출력하기 - 87700
		int money = 87650;
		System.out.println((int)(money / 10 + 5) * 10);
		
		
		int data = 127;
		// << 2는 곱하기 4한 것 과 동일한 효과
		System.out.println(data << 2);
		// >> 2는 나누기 4한 것 과 동일한 효과
		System.out.println(data >> 2);
		// <<34는 32보다 크거나 같으므로 32로 나눈 나머지인 2와 동일
		System.out.println(data <<34);
		

	}

}