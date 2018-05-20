package cn.happy.day01;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		
		try {
			//研发：临界值的问题  
			Scanner in = new Scanner(System.in);
			System.out.print("请输入被除数:");
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d", 
							num1, num2, num1/ num2));
			
		} catch (Exception ex) {
			//参数为1，证明jvm异常退出，其他所有代码都没有执行权，jvm托管了java代码，
		     System.exit(1);
		}
		finally{
			//释放稀缺资源。
			System.out.println("感谢使用本程序！");
		}

	}

}
