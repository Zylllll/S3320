package cn.happy.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		try {
			readDataFromDisk();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readDataFromDisk() throws IOException {
		FileInputStream fs = new FileInputStream("D:\\123.txt");
		byte[] by = new byte[1024];
		int data = 0;
		StringBuffer sBuffer = new StringBuffer();
		while ((data = fs.read(by))!= -1) {
			String temp = new String(by, 0, data);
			sBuffer.append(temp);
			System.out.println(data);
		}
		System.out.println(sBuffer);
		
		fs.close();
	}

}
