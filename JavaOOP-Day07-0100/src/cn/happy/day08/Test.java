package cn.happy.day08;

public class Test {

	public static void main(String[] args) {
		Thread mainThrear = Thread.currentThread();
		Thread myThread = new Thread(new Mythread());
		System.out.println("*******��ʾĬ�����ȼ�*******");
		System.out.println("���߳�����"+mainThrear.getName()+",���ȼ���"+mainThrear.getPriority());				
		System.out.println("���߳�����"+myThread.getName()+",���ȼ���"+myThread.getPriority());
		System.out.println("*******�޸�Ĭ�����ȼ���*******");
		mainThrear.setPriority(Thread.MAX_PRIORITY);  //�޸����߳�Ĭ�����ȼ�
		myThread.setPriority(Thread.MIN_PRIORITY);  //�޸����߳�Ĭ�����ȼ�
		System.out.println("���߳�����"+mainThrear.getName()+",���ȼ���"+mainThrear.getPriority());				
		System.out.println("���߳�����"+myThread.getName()+",���ȼ���"+myThread.getPriority());
	}

}
class Mythread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
