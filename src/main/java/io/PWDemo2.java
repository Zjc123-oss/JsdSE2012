package io;

import java.io.*;

/**
 * 使用流连接形式创建PW完成文本数据的写出操作
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向pw2.txt中写入文本数据
        //低级流，用于将字节写入文件
        FileOutputStream fos
                = new FileOutputStream("pw2.txt");
        /*
            高级流，转换流
            1:负责衔接字符流与字节流
            2:负责将写出的字符按照指定的字符集转换为字节
         */
        OutputStreamWriter osw= new OutputStreamWriter(
                fos,"UTF-8");
        //高级流,缓冲字符输出流。负责块写文本书加速
        BufferedWriter bw = new BufferedWriter(osw);
        //高级流，PW。负责按行写字符串，并可以自动行刷新
        PrintWriter pw = new PrintWriter(bw);
        pw.println("子非鱼，焉知鱼之乐");
        pw.println("诸将易得而，至入信者，国士无双。");
        System.out.println("写出完毕!");
        pw.close();

    }
}
