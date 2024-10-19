package com.rishi.interfaces;

public  interface RBI {
 void withdraw();
 void checkBalance();
 void chagePin();
 default void withDrawLimit() {
	 System.out.println("WITHDRAW LIMIT IS 10000 ONLY");
 }
 static void denomination() {
	 System.out.println("Only 10 and 200 rs notes or new ");
 }
 
private void forRBIUSE() {
	 System.out.println("THIS IS USED ONLY IN RBI");
 }
}
