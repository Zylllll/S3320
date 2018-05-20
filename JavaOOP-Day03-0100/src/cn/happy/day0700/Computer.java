package cn.happy.day0700;

public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk hardDisk;
	
	public Computer(CPU cpu, EMS ems, HardDisk hardDisk) {
		this.cpu = cpu;
		this.ems = ems;
		this.hardDisk = hardDisk;
	}
	
	public void print(){
		System.out.println("计算机信息如下\nCPU的品牌是："+cpu.name()+",主频是："+cpu.zhupin()+"GHZ\n磁盘容量是："+hardDisk.cipan()+"GB\n内存容量是："+ems.neicun()+"GB");
	}
}
