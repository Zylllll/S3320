package cn.happy.day01;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		
		try {
			//�з����ٽ�ֵ������  
			Scanner in = new Scanner(System.in);
			System.out.print("�����뱻����:");
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d", 
							num1, num2, num1/ num2));
			
		} catch (Exception ex) {
			//����Ϊ1��֤��jvm�쳣�˳����������д��붼û��ִ��Ȩ��jvm�й���java���룬
		     System.exit(1);
		}
		finally{
			//�ͷ�ϡȱ��Դ��
			System.out.println("��лʹ�ñ�����");
		}

	}

}
