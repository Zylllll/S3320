package cn.happy.day0600;

public class MyMain {
	public static void main(String[] args) {
		//使用彩色墨盒在A4纸上打印
		InkBox inkBox = new CaiseColor();
		Paper paper = new A4Paper();
		Printer printer = new Printer(inkBox,paper);
		printer.print();
		
		//使用黑白墨盒在B5纸上打印
		inkBox = new HeibaiColor();
		paper = new B5Paper();
		printer = new Printer(inkBox,paper);
		printer.print();
	}
}
