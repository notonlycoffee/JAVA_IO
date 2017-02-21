package com.wwq.java.blog.file.classLogical;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017-2-17.
 */

/**
 * 使用PrintWriter类向文件中写入数据
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        try {

            File file = new File("E:\\one.txt");
            if (file.exists()) {
                System.out.println("file already exists");
                System.exit(0);
            }

            //文件不存在,可以放心地创建文件
            PrintWriter output = new PrintWriter(file);
            output.print("中国");
            output.print("hello world");
            output.println("hell line");
            output.printf("你好吗 %d", 100);

            output.flush();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
