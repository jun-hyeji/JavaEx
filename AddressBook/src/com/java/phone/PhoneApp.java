package com.java.phone;

import java.util.Scanner;

public class PhoneApp {

	protected void addressBook() {
		
		PhoneService phoneService = new PhoneService();
		PhoneView phoneView = new PhoneView();
				
		phoneView.PhoneViewStart();
		Scanner sc = new Scanner(System.in);
		while (true) {
			phoneView.PhoneViewMenu();

			switch (sc.nextInt()) {
			case 1:
				phoneView.PhoneViewList();
				continue;
			case 2:
				phoneView.PhoneViewInsert();
				phoneService.pInsert(phoneService.PhoneInfo(sc));
				System.out.println("[등록되었습니다.]\n");
				continue;
			case 3:
				phoneView.PhoneDelete();
				phoneService.PhoneDelete(sc.nextInt());
				System.out.println("[삭제되었습니다.]\n");
				continue;
			case 4:
				phoneView.PhoneSearch();
				phoneService.PhoneSearch(sc.next());
				continue;
			case 5:
				phoneView.PhoneViewEnd();
				break;
			default:
				phoneView.PhoneViewEr();
				continue;
			}
			sc.close();
			break;
		}

	}

}