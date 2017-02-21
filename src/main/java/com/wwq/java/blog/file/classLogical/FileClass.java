package com.wwq.java.blog.file.classLogical;

import java.io.File;
import java.util.Date;

/**
 * Created by Administrator on 2017-2-17.
 */
public class FileClass {
    /**
     * 文件的相关操作
     * @param args
     * @author jc
     */
    public static void main(String[] args) {
        File file = new File("E:\\one.txt");

        /*
        System.out.println(file.exists());//判断文件是否存在
        System.out.println(file.length() + "bytes");//获取文件的大小
        System.out.println(file.canRead());//判断文件是否可读
        System.out.println(file.canWrite());//判断文件是否可写
        System.out.println(file.isDirectory());//判断file实例是否是一个路径
        System.out.println(file.isFile());//判断file实例是否是一个文件
        System.out.println(file.isAbsolute());//判断file的路径是否是绝对路径
        System.out.println(file.isHidden());//判断file是否隐藏
        System.out.println(file.getAbsolutePath());//获取文件绝对路径
        System.out.println(new Date(file.lastModified()));//获取文件上一次修改的时间
        System.out.println(file.getName());//获取文件名
        System.out.println(file.canExecute());//判断是否可以被执行
        System.out.println(file.getParent());//获取父目录
        file.renameTo(new File("E:\\two.txt"));//重命名一个文件

        */

    }

}
