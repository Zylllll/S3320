package cn.happy.day0600;

public class Printer {
	InkBox inkBox;
	Paper paper;
	
	public Printer(InkBox inkBox,Paper paper){
		this.inkBox = inkBox;
		this.paper = paper;
	}
	
	
	public void print(){
		System.out.println("ʹ��"+inkBox.color()+"ī����"+paper.getSize()+"ֽ�ϴ�ӡ");
	}

}
