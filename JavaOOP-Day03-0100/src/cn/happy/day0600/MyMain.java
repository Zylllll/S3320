package cn.happy.day0600;

public class MyMain {
	public static void main(String[] args) {
		//ʹ�ò�ɫī����A4ֽ�ϴ�ӡ
		InkBox inkBox = new CaiseColor();
		Paper paper = new A4Paper();
		Printer printer = new Printer(inkBox,paper);
		printer.print();
		
		//ʹ�úڰ�ī����B5ֽ�ϴ�ӡ
		inkBox = new HeibaiColor();
		paper = new B5Paper();
		printer = new Printer(inkBox,paper);
		printer.print();
	}
}
