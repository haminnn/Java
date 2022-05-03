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
			System.out.println("## �޴� �Է�:");
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
					System.out.println("�޴��� �߸� �Է��Ͽ����ϴ�.");	
				
			}
			
		}while(menu!=9);
		
		
	}
	
	public static void printMenu() {
		System.out.println("====== << �� ���� ���α׷� >> ======");
		System.out.println("1.��ü �� ���� ��ȸ");
		System.out.println("2.�� ���� �߰�");
		System.out.println("3.�� ���� ����");
		System.out.println("9.�ý��� ����");
		System.out.println("=================================");
	}

}
