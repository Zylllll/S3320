package cn.happy.day01;

public class Day04 {
	/**
	 * �����������������ɶ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int result=test();
		System.out.println(result);
	}

	static int test() {
		int x = 1;
		try {
			x++;
			return x; //   �¿�һ��ռ�  ����x��ֵ����һ�ݣ��Է��㷽�����ȷŻ�ȡ��ֵ��
		} finally {
			++x;
		}
	}
}
