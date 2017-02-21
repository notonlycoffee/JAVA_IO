package com.wwq.java.blog.io.classLogincal;

import java.io.*;

/**
 * Created by Administrator on 2017-2-21.
 */

/**
 * 使用IO过滤器类包装普通的IO类,读取或者输入基本数据类型的数据;
 */
public class TestDataStream {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("E:\\two.dat")));
            out.writeUTF("Johe");
            out.writeDouble(84.5);
            out.writeUTF("Jim");
            out.writeDouble(182);
            out.writeUTF("George");
            out.writeDouble(103);

            out.close();



            DataInputStream in = new DataInputStream(new FileInputStream(new File("E:\\two.dat")));
            System.out.println(in.readUTF() + "  " + in.readDouble());
            System.out.println(in.readUTF() + "  " + in.readDouble());
            System.out.println(in.readUTF() + "  " + in.readDouble());

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
