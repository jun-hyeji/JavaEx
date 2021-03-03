package com.javaex.basic.practice01;

public class Problem03 {

	public static void main(String[] args) {
		// 구구단	행(세로.row),열(가로.col)
		for(int num = 1; num <= 5; num ++) {
			for (int dan = 1; dan <= 9; dan++) {
				System.out.printf("%d * %d = %d\t", dan,num,dan * num);
			}
			System.out.println();
		}
	}

}
