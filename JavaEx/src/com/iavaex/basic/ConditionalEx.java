package com.iavaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifEx();
//		ifElseEx();
//		ifPractice();
//		switchEx();
//		switchEx2();
		ifPractice02();
		
	}
	//	연습문제
	private static void ifPractice02() {
		Scanner scanner = new scanner(System.in);
		System.out.print("점수를 입력하세요)");
		int score = scanner.nextInt();
		
//		if ( score %3 == 0    ) {
//			//	3의배수
//			System.out.println( score + "는 3의 배수입니다.");
//		} else {
//			System.out.println( score + "는 3의 배수가 아닙니다.");
//		}
		System.out.println(score + "는 " +
				(score  %  3== 0 ? "3의배수"))
		scanner.close();
	}
	
	//	java의 case 문제는 char, string도 점검할 수 있다.
	private static void switchEx3() {
		String day = "TUE";
		String message;	//	결과 변수
//		요일 변수 : 지정된 범위의 값만 들어와야 한다.
		
		switch(day) {
		case"SUN":
			message= "일요일";
			break;
		case"MON":
		case"TUE":
		case"WED":
		case"THU":
			message = "열공";
		case"FRI":
			message = "불금";
		case"SAT":
			message = "주맣";
		default:
			message = "?";
		}
		System.out.println();
	}
	//	연습문제
	private static void switchEx2() {
//		월을
//		입력받아 해당월의 일수를 출력하는
//		프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요");
		
		int month = scanner.nextInt();
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month + "월은 31일입니다.");
			break;   	//	잊지말자
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(month + "월은 30일입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다.");
			break;
		default :
			System.out.println("?");
		}
		scanner.close();
	}
	//	switch  ~ case
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목코드( 1.자바 2.C 3.C++ 4.파이썬 ) : ");
		
		int code = scanner.nextInt();
		
		switch (code) {
		case 1:
			System.out.println("R101호입니다.");
			break;	//	잊지 말자
		case 2:	//	code == 2
			System.out.println("R202호입니다.");
			break;
		case 3: //	code == 3
			System.out.println("R303호입니다");
			break;
		case 4: //	code == 4
			System.out.println("R404호입니다.");
			break;
		default:	//	마지막  else
			System.out.println("관리자에게 문의하세요.");
		}
		scanner.close();              
		
		//	이 뒤에서는 scanner의 메서드를 사용할 수 없다.
		
	}
	//	연습문제 01
	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("( 1.자바 2.C 3.C++ 4.파이썬 )");
		int code = scanner.nextInt();
		
		if (code == 1 ) {
			System.out.println("R101호 입니다.");
		} else  if ( code == 2 ) {
			System.out.println("R202호 입니다.");
		}	else if ( code == 3 )  {
			System.out.println("R303호 입니다.");
		}	else if ( code == 4 ) {
			System.out.println("R404호 입니다.");
		}	else {
			System.out.println("나머지는 상담원에게 문의하세요.");
		}
		scanner.close();
	}
	//	if ~ else  if ~ else 문
	private static void ifElseEx() {
//		숫자를 
//		입력받아
//		숫자가  
//		0보다 크면 양수 " 0보다 작으면 음수 "0일 때는" 0입니다 를 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num  = scanner.nextInt();	// 정수 입력 
		/*
		if ( num > 0 ) {
			System.out.println("양수입니다.");
		}	else if( num < 0 ) {
			System.out.println("음수입니다.");
		}	else {
			System.out.println("0입니다.");
		}
		*/
		
		//	중첩 if : if문은 중첩될수 있다
		if (num == 0 ) {
			System.out.println("0입니다.");
		}	else {	// !=0
			if (num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		//	if문의 중첩이 3단계이상 -> 의심해보자
		scanner.close();
	}        
	
	//	if	분기문
	private static void ifEx() {
//		"점수를
//		입력받아
//		점수가
//		60점 이상이면 합격입니다 를 출력하세요 
		//	그렇지 않으면  불합격입니다.를 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = scanner.nextInt();
		
		//	조건 분기
		if ( score >= 60 ) {	//	 참일 때
			System.out.println("합격입니다.");
		} else {
			//	거짓일 때
			System.out.println("불합격입니다.");
		}
		scanner.close();
				
	}
}
