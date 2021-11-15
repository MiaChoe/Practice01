package com.javaex.practice;//출제포인트: 문자열과 정수형이 혼합되어 있을 시의 작성법, 산술 연산자 적용, println과 print의 차이점 적용 

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("월급을 입력하세요:");
		
		int num = sc.nextInt();
		
		System.out.println("10년동안 최대 저축액은 "+(120*num)+"원 입니다.");
		
	}
}
