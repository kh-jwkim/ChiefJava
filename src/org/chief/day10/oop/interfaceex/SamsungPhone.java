package org.chief.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface, MP3Interface {

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("===== SAMSUNG =====");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("===== S-PHONE CALL =====");
	}
		
}
