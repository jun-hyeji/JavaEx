package com.java.phone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {
	private Scanner scan;
	private  Map<String, Phone> phoneBookMap;
	
	public PhoneBook() {
		scan = new Scanner(System.in);
		phoneBookMap = new HashMap<>();
	}
	
	// 메뉴를 출력하는 메서드
	public void displayMenu(){
		System.out.print(" 1.리스트");
		System.out.print(" 2.등록");
		System.out.print(" 3.삭제");
		System.out.print(" 4.검색");
		System.out.println(" 5.종료");
		System.out.println("---------------------------------------");
		System.out.print(">메뉴 번호 ");		
	}
	
	public void phoneBookStart(){
		System.out.println("***********************************************");
		System.out.println("              전화번호 관리 프로그램                ");
		System.out.println("***********************************************");
		
		while(true){
			
			displayMenu();  // 메뉴 출력
			
			int menuNum = scan.nextInt();   // 메뉴 번호 입력
			
			switch(menuNum){
				case 1 : displayAll();	// 전체 출력
					break;
				case 2 : insert();		// 등록
					break;
				case 3 : delete();		// 삭제
					break;
				case 4 : search();		// 검색
					break;
				case 5 : 
					System.out.println("[감사합니다.]");
					return;
				default :
					System.out.println("[다시입력하세요.]");
			} 
		} 
	}
	
	private void search() {
		System.out.println();
		System.out.println("검색할 전화번호 정보를 입력하세요");
		System.out.print("이 름 >> ");
		String name = scan.next();
		
		Phone p = phoneBookMap.get(name);
		
		if(p == null) {
			System.out.println(name + " 씨의 전화번호 정보가 없습니다.");
		} else {
			System.out.println(name + " 씨의 전화번호 정보");
			System.out.println("이름 : " + p.getName());
			System.out.println("휴대전화 : " + p.getHp());
			System.out.println("집전화 : " + p.getTel());
		}
		System.out.println("검색 완료");
	}

	private void delete() {
		System.out.println();
		System.out.println("삭제할 전화번호 정보를 입력하세요");
		System.out.print("번호 >> ");
		String name = scan.next();
		
	
		if(phoneBookMap.remove(name) == null) {
			System.out.println(name + " 는 등록된 사람이 아닙니다.");
		} else {
			System.out.println(name + " 의 정보를 삭제했습니다.");
		}
		System.out.println("[삭제 완료]");
	}

	private void update() {
		System.out.println();
		System.out.println("수정할 전화번호 정보를 입력하세요");
		System.out.print("이 름 >> ");
		String name = scan.next();
		
		
		if(phoneBookMap.get(name) == null) {
			System.out.println(name + "는 전화번호 정보가 없습니다.");
			return; 
		}
		
		System.out.print("전화번호 >> ");
		String hp = scan.next();
		
		System.out.print("집전화 >> ");
		scan.nextLine();	
		String tel = scan.nextLine();
		
		Phone p = new Phone(name,hp,tel);
		phoneBookMap.put(name, p);

		System.out.println(name + " [수정 완료]");
		
	}
	private void displayAll() {
		Set<String> keySet = phoneBookMap.keySet();
		
		System.out.println("=====================================");
		System.out.println(" 번호\t이름\t휴대전화\t집전화 ");
		System.out.println("=====================================");
		
		if(keySet.size() == 0) {
			System.out.println("등록된 전화번호 정보가 없습니다.");
		} else {
			Iterator<String> it = keySet.iterator();
			
			int cnt = 0;
			while(it.hasNext()) {
				cnt++;
				String name = it.next();
				Phone p = phoneBookMap.get(name);
				System.out.println(" " + cnt + "\t" + p.getName() + "\t" + p.getHp() + "\t" + p.getTel());
			}
		}
		System.out.println("=====================================");
		System.out.println("[출력 완료]");
	}

	private void insert() {
		System.out.println();
		System.out.println("등록할 전화번호 정보를 입력하세요");
		System.out.print("이 름 >> ");
		String name = scan.next();
		
		
		if(phoneBookMap.get(name) != null) {
			System.out.println(name + "는 이미 등록된 사람입니다.");
			return; 
		}
		
		System.out.print("전화번호 >> ");
		String tel = scan.next();
		
		System.out.print("주소 >> ");
		scan.nextLine();	
		String addr = scan.nextLine();
		
		phoneBookMap.put(name, new Phone(name, tel, addr));
		System.out.println(name + "[등록 완료]");
	}

	public static void main(String[] args) {
		new PhoneBook().phoneBookStart();
	}
		

}
