package com.example.demo.javax0.基础语法.文件IO;

import java.io.File;

/**
 * 文件递归删除，以及文件夹删除
 * Created by 李泽阳 on 2020/4/11 23:23
 */
public class FileRecur {


    public void deleteFile() throws Exception {
        File file = new File("D:\\aaa\\cc");
    }


    public void parseFile(File file) throws Exception {
        if (file == null || file.exists()) {
            return;
        }

        File[] listFiles = file.listFiles();
        for (File f : listFiles) {

            if (f.isDirectory()) {
                parseFile(f);//递归循环
            } else {
                f.delete();//删除文件
            }

        }
        file.delete();//删除文件夹

    }
}
