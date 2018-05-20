package cn.happy.day0200;
@SuppressWarnings("unused")
public class Return {

	public static void main(String[] args) {
		int reult = test();
		System.out.println(reult);
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
	static int test1() {
		int x = 1;
		try {
			x++;
			return x; //   新开一块空间  ，将x的值保存一份，以方便方法调度放获取该值。
		} finally {
			++x;
		}
	}
	
	static int test2() {
		int x = 1;
		
		try {
			
			int result=5/0;
			x++;
		}catch(Exception ex){
			return x++; //    1
		}
		finally {
			x++;
		}
		return x;
	}

}
