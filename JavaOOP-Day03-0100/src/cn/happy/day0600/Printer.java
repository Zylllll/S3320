package cn.happy.day0600;

public class Printer {
	InkBox inkBox;
	Paper paper;
	
	public Printer(InkBox inkBox,Paper paper){
		this.inkBox = inkBox;
		this.paper = paper;
	}
	
	
	public void print(){
		System.out.println("使用"+inkBox.color()+"墨盒在"+paper.getSize()+"纸上打印");
	}

}
