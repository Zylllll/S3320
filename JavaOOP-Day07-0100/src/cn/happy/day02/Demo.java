package cn.happy.day02;

public class Demo {

	public static void main(String[] args) {
		int sum = 50;
		int jiao = 120;
		int ji = 2;
		int tu = 4;
		
		// （兔的脚数×总只数－总脚数）÷（兔的脚数－鸡的脚数）= 鸡的只数 
		int jishu = (tu*sum - jiao) /(tu-ji);
		int tushu = sum - jishu;
		System.out.println("鸡有："+jishu+"只");
		System.out.println("兔有："+tushu+"只");
	}

}
