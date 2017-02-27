package com.wwq.java.blog.io.classLogincal;

import java.io.*;

/**
 * Created by jc on 2017/2/27.
 */

/**
 * 使用对象输出流,将数据输入到文件中
 * 使用对象输入流,将文件中的数据写入到内存中;
 */
public class TestObjectStream {
    public static void main(String[] args) {
        File file = new File("E:\\one.dat");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            int[] nums = {1, 2, 3, 4};
            String [] strings = {"a","b","c"};
            out.writeObject(nums);
            out.writeObject(strings);

            out.flush();
            out.close();


            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            int [] numeric = (int[]) in.readObject();
            String [] strArrays = (String[]) in.readObject();

            for (int num : numeric) {
                System.out.print(num + "  ");
            }

            System.out.println();

            for (String str : strArrays) {
                System.out.print(str + "   ");
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
