package com.javaex.practice; //출제 포인트: 산술 연산자 적용, println과 print의 차이점 적용, 변수가 아닌 상수 설정, scanner 적용  

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요:");
		double r = sc.nextDouble();
		double extentOfCircle = r*r*PI;
		System.out.println("원의 넓이는 "+extentOfCircle);
		
		sc.close();
	}

}