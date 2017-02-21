package com.wwq.java.blog.file.classLogical;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017-2-18.
 */

/**
 * 使用Scanner从文件中读取内容
 *
 * scanner.next(),nextByte(),nextShort(),nextInt(),nextLong(),nextFloat(),nextDouble()
 * 等都是根据分隔符进行读取数据的,默认的分隔符是空格,可以使用方法useDelimiter(String regex)设置新的分隔符;
 *
 * 读取方式:首先跳过任意分隔符(默认空格),然后读取一个以分隔符结束的数据
 */
public class ScannerDemo {
    public static void main(String[] args) {
        File file = new File("E:\\one.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String first = scanner.next();
                System.out.println(first);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
