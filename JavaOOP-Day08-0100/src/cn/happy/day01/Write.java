package cn.happy.day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		try {
			writeDataDisk();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeDataDisk() throws IOException {
		FileOutputStream fs = new FileOutputStream("D:\\S2230.txt");
		String temp = "��������ŵ��ϿΣ���Ҫ�ٵ�";
		byte[] bytes = temp.getBytes();
		fs.write(bytes);
		fs.close();
		System.out.println("д��ɹ�");
	}

}
