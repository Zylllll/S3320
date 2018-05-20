package cn.happy.day0300;

public class SecurityDoor extends Door implements Lock,Doorbell {

	@Override
	public void openLock() {
		System.out.println("晚上下班回家，先开锁");
		
	}

	@Override
	public void closeLock() {
		System.out.println("关门了，上锁了");
		
	}

	@Override
	public void open() {
		System.out.println("开完锁，开门进房间");
		
	}

	@Override
	public void close() {
		System.out.println("早上上班出门时，关门了");
		
	}

	@Override
	public void ring() {
		System.out.println("有人按门铃");
	}

}
