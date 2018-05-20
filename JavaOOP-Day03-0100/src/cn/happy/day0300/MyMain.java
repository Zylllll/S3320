package cn.happy.day0300;

public class MyMain {

	public static void main(String[] args) {
		SecurityDoor securityDoor = new SecurityDoor();
		securityDoor.openLock();
		securityDoor.open();
		securityDoor.close();
		securityDoor.closeLock();
		securityDoor.ring();

	}

}
