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
		System.out.println("�������Ϣ����\nCPU��Ʒ���ǣ�"+cpu.name()+",��Ƶ�ǣ�"+cpu.zhupin()+"GHZ\n���������ǣ�"+hardDisk.cipan()+"GB\n�ڴ������ǣ�"+ems.neicun()+"GB");
	}
}
