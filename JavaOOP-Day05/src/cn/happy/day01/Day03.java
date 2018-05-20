package cn.happy.day01;

import java.util.Scanner;

public class Day03 {
   /**
    * 关于没有返回值的方法使用return;用法造成的影响，实现的效果
    * @param args
    */
	public static void main(String[] args) {
		run();
		
	}

	public static void run(){
		
		
		if(1==1){
			System.out.println("1");
			//结束当前方法执行
			return;
		}
		
		System.out.println("你能看到我吗？");
	}
}
