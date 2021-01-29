package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本功能
 * 程序启动后要求用户输入文件名，然后对文件进行写操作。
 * 之后用户输入的每一行字符串都要按行写入到文件中。
 * 当用户单独输入exit时程序退出。
 *
 * 要求:创建PrintWriter并且自行创建流连接完成。
 *
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scanner.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(
                fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        System.out.println("请开始输入内容,单独输入exit退出");
        while(true){
            String line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见!");
        pw.close();
    }
}









