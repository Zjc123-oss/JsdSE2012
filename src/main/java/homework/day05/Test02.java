package homework.day05;

import java.io.*;

/**
 * 改正下面程序的错误
 * 
 * 程序实现需求:使用缓冲流完成文件的复制操作
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("user.dat");
		    BufferedInputStream bis = new BufferedInputStream(fis);

	        FileOutputStream fos = new FileOutputStream("user_cp02.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

	          int d;
	          long start = System.currentTimeMillis();
	          while((d = bis.read())!=-1) {
//				  byte[] data = line.getBytes("UTF-8");
	            	bos.write(d);
	            	bos.flush();
	          }
		      long end = System.currentTimeMillis();
	           System.out.println("复制完毕!耗时"+(end-start)+"毫秒");
	           bos.close();
	}
}
