package com.wwq.java.blog.io.classLogical;

import java.io.*;

/**
 * Created by Administrator on 2017-2-21.
 */

/**
 * 使用文件输出流,将数据保存到文件中;
 * 使用文件输入流,将数据从外部读取到内存的程序中;
 */
public class TestFileStream {
    public static void main(String[] args) {
        try {
            OutputStream out = new FileOutputStream(new File("E:\\two.dat"));
            for (int i = 0; i < 10; i++) {
                out.write(i);
            }

            //必须关闭相应的流
            out.close();


            InputStream in = new FileInputStream(new File("E:\\two.dat"));
            int temp = 0;
            while ( (temp = in.read()) != -1) {
                System.out.print(temp+"  ");
            }

            //必须关闭相应的流
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
