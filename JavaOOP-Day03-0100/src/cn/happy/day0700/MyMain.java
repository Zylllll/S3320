package cn.happy.day0700;

public class MyMain {

	public static void main(String[] args) {
		CPU cpu = new Name();
		EMS ems = new Neicun();
		HardDisk hardDisk = new Cipan();
		Computer computer = new Computer(cpu, ems, hardDisk);
		computer.print();
	
	}

}
