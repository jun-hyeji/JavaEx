package com.javaex.basic.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// 정수 다섯개를 입력받아 가장  큰수 르 ㄹ출력하세요
		int max = 0;
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i = 1; i <= 5; i++) {
			System.out.print("숫자");
			int num = scanner.nextInt();
			
			if (num > max) max = num;
		}
		System.out.println("최댓값은 " + max + "입니다.");
		scanner.close();
	}

}
