package com.javaex.basic.types;

//	물리형
//	참, 거짓을 다루는 다료형
//	값에 따라서 조건문, 제어문을 이용 흐름제어에 사용 -> 중요
public class BoolenEx {

	public static void main(String[] args) {
		boolean b1 = true;	//	참
		boolean	b2 = false;	//	거짓
		
		System.out.println(b1);
		System.out.println(b2);
		
		//	비교, 논리 연산이 결과로 추출된다
		int v1 = 3, v2 = 5;
		boolean result = v1 < v2;
		
		System.out.println(v1 + " < " + v2 + " = ");

	}

}
