package cn.happy.day0300;

public class SecurityDoor extends Door implements Lock,Doorbell {

	@Override
	public void openLock() {
		System.out.println("�����°�ؼң��ȿ���");
		
	}

	@Override
	public void closeLock() {
		System.out.println("�����ˣ�������");
		
	}

	@Override
	public void open() {
		System.out.println("�����������Ž�����");
		
	}

	@Override
	public void close() {
		System.out.println("�����ϰ����ʱ��������");
		
	}

	@Override
	public void ring() {
		System.out.println("���˰�����");
	}

}
