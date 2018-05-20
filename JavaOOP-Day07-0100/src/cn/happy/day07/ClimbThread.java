package cn.happy.day07;

public class ClimbThread extends Thread {
	private int time;
	private int num;
	

	public ClimbThread(int time, int num,String name) {
		super(name);
		this.time = time;
		this.num = num / 100;
	}
	
	@Override
	public void run() {
		while (num>0) {
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"爬完100米！");
				num--;
			}
		System.out.println(Thread.currentThread().getName()+"到达终点");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
