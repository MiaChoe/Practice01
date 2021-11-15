package com.javaex.practice; //출제 포인트: 산술 연산자 적용, println과 print의 차이점 적용, 변수가 아닌 상수 설정, scanner 적용 

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		final double rateExchange = 1230.95;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요:");
		double won = sc.nextDouble();	
		double dollar = (won/rateExchange);
		System.out.println("받으실 달러는 "+dollar);
		
	}

}
