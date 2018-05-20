package cn.happy.day08;

public class Test {

	public static void main(String[] args) {
		Thread mainThrear = Thread.currentThread();
		Thread myThread = new Thread(new Mythread());
		System.out.println("*******显示默认优先级*******");
		System.out.println("主线程名："+mainThrear.getName()+",优先级："+mainThrear.getPriority());				
		System.out.println("子线程名："+myThread.getName()+",优先级："+myThread.getPriority());
		System.out.println("*******修改默认优先级后*******");
		mainThrear.setPriority(Thread.MAX_PRIORITY);  //修改主线程默认优先级
		myThread.setPriority(Thread.MIN_PRIORITY);  //修改子线程默认优先级
		System.out.println("主线程名："+mainThrear.getName()+",优先级："+mainThrear.getPriority());				
		System.out.println("子线程名："+myThread.getName()+",优先级："+myThread.getPriority());
	}

}
class Mythread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
