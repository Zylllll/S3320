package cn.happy.day11;

public class Site implements Runnable {
	private int count = 10;
	private int num = 0; // ��¼�򵽵ڼ���Ʊ

	@Override
	public void run() {
		while (count>0) {
			if (sale() == false) {
				break;
			}
		}
	}
	
	public synchronized boolean sale() {
		if (count <= 0) {
			return false;
		}
		num++;
		count--;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������"+num+"Ʊ,ʣ��"+count+"Ʊ");
		if (Thread.currentThread().getName().equals("��ţ��")) {
			return false;
		}
		return true;
	}
}