package com.javaex.practice;

public class Ex04 {/*출제 포인트: 변수와 자료형 정확한 표기법. 1.변수를 선언하는 세미콜론이 모두 없다 2.자료형을 안 써뒀다 3.최종출력하고자 하는 변수 이름
	예상하는 최종 출력값은 30
	*/
	
	public static void main(String[] args) {
		int x; int y;
		
		x = 10; //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@대박 신기한 게, int x = 10; 이렇게 선언한 거 밑에 쓰니까 에러남. 중복됐대
		y = 20;
		
		int sum = (x+y); //물론 x+y에 괄호를 치지 않아도 됨
		
		System.out.println(sum);		
	}
	
}
