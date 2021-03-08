package com.javaex.practice01;

public class Problem01 {

	public static void main(String[] args) {
		continueEx();

	}
	private static void continueEx() {
		//	1에서 100까지의 수에서 5의배수이면서 7의배수인 수를 출력하세요
		
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}