package cn.happy.day01;
import java.util.Scanner;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

//import org.apache.log4j.Logger;
//import java.awt.Label;

public class Day01 {

	//static Logger logger = Logger.getLogger("");
	static Logger logger = (Logger) LoggerFactory.getLogger("");
	public static void main(String[] args) {
		
		try {
			logger.info("11");
			//logger.warn("到了");
			//logger.error("出错了");
			//研发：临界值的问题  
			Scanner in = new Scanner(System.in);
			System.out.print("请输入被除数:");
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			String format = String.format("%d / %d = %d", 
					num1, num2, num1/ num2);
			System.out.println(format);
		} catch (NullPointerException ex) {
		   System.out.println("除数不能为0");	
		}catch (ArithmeticException ex) {
		       ex.printStackTrace();
			   System.out.println(ex.getMessage());
			   
			   //System.out.println("除数不能为0===ArithmeticException");	
		}catch (Exception ex) {
			   System.out.println("除数不能为0===Exception");	
		}
		finally{
			//释放稀缺资源。
			System.out.println("感谢使用本程序！");
		}

	}

}
