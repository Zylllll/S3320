package cn.happy.day02;

public class Demo {

	public static void main(String[] args) {
		int sum = 50;
		int jiao = 120;
		int ji = 2;
		int tu = 4;
		
		// ���õĽ�������ֻ�����ܽ������£��õĽ��������Ľ�����= ����ֻ�� 
		int jishu = (tu*sum - jiao) /(tu-ji);
		int tushu = sum - jishu;
		System.out.println("���У�"+jishu+"ֻ");
		System.out.println("���У�"+tushu+"ֻ");
	}

}
