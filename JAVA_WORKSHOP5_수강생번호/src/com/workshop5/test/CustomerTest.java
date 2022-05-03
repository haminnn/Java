package com.workshop5.test;

import com.workshop5.test.CustomerBiz;
import com.workshop5.util.CustomerUtil;

public class CustomerTest {
	public static void main(String[] args) {
		ICustomerBiz biz = new CustomerBiz();
		biz.initializeCustomer();
		int menu = 0;
		do {
			printMenu();
			System.out.println("## 메뉴 입력:");
			menu = Integer.parseInt(CustomerUtil.getUserInput());
			switch(menu) {
				case 1 :
					biz.printAllCustomer();
					break;
				case 2 :
					biz.insertCustomer();
					break;
				case 3 :
					biz.deleteCustomer();
					break;
				case 9 :
					
					System.exit(0);
				default :
					System.out.println("메뉴를 잘못 입력하였습니다.");	
				
			}
			
		}while(menu!=9);
		
		
	}
	
	public static void printMenu() {
		System.out.println("====== << 고객 관리 프로그램 >> ======");
		System.out.println("1.전체 고객 정보 조회");
		System.out.println("2.고객 정보 추가");
		System.out.println("3.고객 정보 삭제");
		System.out.println("9.시스템 종료");
		System.out.println("=================================");
	}

}
