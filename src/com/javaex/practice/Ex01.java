package com.javaex.practice;//2021.11.17(수)08:40 Practice01과 github 내 Practice01연동 안 되는 중

public class Ex01 {
	public static void main(String[] args) {
		/* 출제 포인트: 식별자의 개념과 식별자 명명조건 파악
		1) 변수 이름이 예약자 이름이라 불가능
		2) 변수 이름의 시작이 소문자 알파벳이 아닌 특수문자(그것도 불가능한)임
		3) 변수명은 Letters of String인데 이는 정수형 변수의 이름으로 적합하지 않다
		4) 변수 이름 시작은 소문자 알파벳이어야 하는데 숫자로 시작되었다
		5) 변수에 넣을 수 있는 특수문자는 _ 뿐이다
		6) 변수 이름 시작은 소문자 알파벳이어야 하는데 특수문자인 _뿐이다
		*/
		
		//상기 포인트: 식별자(변수명, 클래스명, 메소드 명 등)는 <1>숫자로 시작 불가 <2>특수문자는 $, _만 사용 가능 <3>기존 예약어 사용 불가
		
		int hello;
		int of_workers;
		String countOfLettersInString;
		int Level_1st_1;
		int person_no;
		int person_;
	}
	
}
