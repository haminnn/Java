package com.workshop3.entity;

import java.util.Scanner;

public class Travel {
	private String travelCode;
	private String cityName;
	private String flight;
	private int travelType;
	private int maxPeople;
	private int reserved;
	public static final int INDIVIDUAL = 0;
	public static final int PACKAGE = 1;
	
	public Travel(String travelCode, String cityName, String flight, int travelType, int maxPeople) {
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
		this.travelType = travelType;
		this.maxPeople = maxPeople;
		reserved = 0;
	}
	public String getTravelCode() {
		return travelCode;
	}
	public String getCityName() {
		return cityName;
	}
	public String getFlight() {
		return flight;
	}
	public String getTravelType() {
		String str = null;
		if(travelType == INDIVIDUAL) {
			str = "������������";
		}
		else if(travelType == PACKAGE){
			str = "��Ű������";
		}
		return str;
	}
	public int getMaxPeople() {
		return maxPeople;
	}
	public int getReserved() {
		return reserved;
	}
	public void setReserved(int reserved) {
		this.reserved = reserved;
	}
	public void printTravelInfo() {
		
		System.out.printf("%1$6s  %2$4s  %3$5s  %4$6s    %5$2d��     %6$2d��\n"
				, travelCode, cityName, flight, getTravelType(), maxPeople, reserved);
		}
	
	
	

}
