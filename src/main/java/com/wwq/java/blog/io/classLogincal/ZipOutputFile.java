package com.wwq.java.blog.io.classLogincal;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Administrator on 2017-3-1.
 * 压缩单个文件
 */
public class ZipOutputFile {
    public static void main(String[] args) {
        File file = new File("two.txt");
        File fileOut = new File("two.zip");
        try {
            InputStream in = new FileInputStream(file);

            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(fileOut));
            ZipEntry entry = new ZipEntry(file.getName());

            out.putNextEntry(entry);
            out.setComment("www");

            int temp=0;
            while ((temp = in.read()) != -1) {
                out.write(temp);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
