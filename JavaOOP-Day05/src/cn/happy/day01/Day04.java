package cn.happy.day01;

public class Day04 {
	/**
	 * 高手能做错，可能能蒙对
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
			return x; //   新开一块空间  ，将x的值保存一份，以方便方法调度放获取该值。
		} finally {
			++x;
		}
	}
}
