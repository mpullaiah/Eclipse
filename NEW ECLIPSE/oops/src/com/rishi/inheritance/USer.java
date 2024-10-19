package com.rishi.inheritance;

public class USer {
public static void main(String[] args) {
	Guest guest = new Guest();
	guest.read();
	 Developer dev = new Developer();
	 dev.read();
	 dev.write();
	 
	 Admin admin = new Admin();
	 admin.write();
	 admin.write();
	 admin.manage();
}
}