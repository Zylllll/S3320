package cn.happy.day01;
@SuppressWarnings("unused")
public class Day05 {
	/**
	 * �����������������ɶ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int result=test();
		System.out.println(result);
	}

	@SuppressWarnings("finally")
	
	static int test() {
		int x = 1;
		
		try {
			int result=5/0;
			x++;
		}catch(Exception ex){
			return x++; //    1
		}
		finally {
			return ++x;
		}
	}
}
