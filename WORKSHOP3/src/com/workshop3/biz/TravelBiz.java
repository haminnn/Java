package com.workshop3.biz;

import java.util.Arrays;

import com.workshop3.entity.Travel;

public class TravelBiz {
	private Travel[] travels;
	public TravelBiz() {
		travels = new Travel[5];
		travels[0] = new Travel("TRV001", "����", "�����װ�", Travel.INDIVIDUAL, 10);
		travels[1] = new Travel("TRV002", "������", "����������", Travel.INDIVIDUAL, 7);
		travels[2] = new Travel("TRV003", "LA", "��Ÿ�װ�", Travel.PACKAGE, 12);
		travels[3] = new Travel("TRV004", "�����ī", "�����װ�", Travel.INDIVIDUAL, 15);
		travels[4] = new Travel("TRV005", "����", "�����װ�", Travel.PACKAGE, 10);
		
//		travels = new Travel[] {
//				new Travel("TRV001", "����", "�����װ�",   Travel.INDIVIDUAL, 10),
//				
//				new Travel("TRV002", "������", "����������", Travel.INDIVIDUAL,7),
//				new Travel("TRV003", "LA", "��Ÿ�װ�", Travel.PACKAGE,12),
//				new Travel("TRV004", "�����ī", "�����Ѱ�",Travel.INDIVIDUAL,15),
//				new Travel("TRV005","����", "�����װ�", Travel.PACKAGE,10)
//			};
		
	}
	public void printAllTravels() {
        for (Travel t : travels) {
        	t.printTravelInfo();
        }
	}

	public void printIndividualTravels() {
		for (Travel t : travels) {
			if (t.getTravelType().equals("������������")) {
				t.printTravelInfo();
			}
        }
	}

	public void printPackageTravels() {
		for (Travel t : travels) {
			if (t.getTravelType().equals("��Ű������")) {
				t.printTravelInfo();
			}
        }
	}
	public Travel reserveTravel(String travelCode, int reserveCount) {
		Travel n = null;
		for (Travel travel : travels) {
			if (travel.getTravelCode().equals(travelCode) ) {
				 int people = travel.getMaxPeople()-travel.getReserved();
				if (people> reserveCount){
					travel.setReserved(travel.getReserved()+reserveCount);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					n = travel;
				}else {
					System.out.println("���� ���� �ο��� �ʰ��Ǿ����ϴ�.(���� ���� �ο�: "+people+"��)");
				}				
			} //outer if end
		}//for end
		return n;
	}
	public void printTravelListTitle() {
		System.out.println();
	}
	

}
