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
			//logger.warn("����");
			//logger.error("������");
			//�з����ٽ�ֵ������  
			Scanner in = new Scanner(System.in);
			System.out.print("�����뱻����:");
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			String format = String.format("%d / %d = %d", 
					num1, num2, num1/ num2);
			System.out.println(format);
		} catch (NullPointerException ex) {
		   System.out.println("��������Ϊ0");	
		}catch (ArithmeticException ex) {
		       ex.printStackTrace();
			   System.out.println(ex.getMessage());
			   
			   //System.out.println("��������Ϊ0===ArithmeticException");	
		}catch (Exception ex) {
			   System.out.println("��������Ϊ0===Exception");	
		}
		finally{
			//�ͷ�ϡȱ��Դ��
			System.out.println("��лʹ�ñ�����");
		}

	}

}
