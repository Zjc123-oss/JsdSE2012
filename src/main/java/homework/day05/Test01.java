package homework.day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 改正下面程序的错误
 * 
 * 程序实现的功能需求:复制一个文件
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("user.dat");
		FileOutputStream fos = new FileOutputStream("user_cp.dat");
           int len;
		   byte[] data = new byte[1024*10];
				while((len=fis.read(data))!=-1) {
			      	fos.write(data,0,len);
					}
				System.out.println("复制完毕!");
					fis.close();
	             fos.close();
	}
}




