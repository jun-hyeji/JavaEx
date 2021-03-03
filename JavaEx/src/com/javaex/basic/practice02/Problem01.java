package com.javaex.basic.practice02;

public class Problem01 {

	public static void main(String[] args) {
		arrayEx01();
		// 다음 주어진 데이터를 이용하여 
//		3의 배수의 개수와 배수의 합을 
//		아래와 같이 출력하는 프로그램을 작성하세요
	}
	private static void arrayEx01() {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int i;
		int count = 0;
		for ( i = 0; i < data.length; i++)
			if(data[i] % 3 == 0 ) count++;
		System.out.println("3의 배수의 개수는? "+ count);
	}
}
