package com.example.demo.Javax0基础.JavaX基础语法.文件IO;

import java.io.*;

/**
 * readerDemo 文件读取类
 * Created by 李泽阳 on 2020/4/12 10:50
 */
public class ReaderWriter {
    public static void main(String[] args) {
        //创建文件流的三个步骤
        //1、创建文件对象FileReader
        //2、读取数据
        //3、关闭流文件
    }

    /**
     * 读文件流
     */
    public void readerTest() {
        //创建文件FileReader对象
        File file = new File("txt.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            reader.read();
        } catch (IOException e) {
            if (file != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * 写入流的
     */
    public void writerTest() {
        //创建文件FileReader对象
        File file = new File("txt.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                writer.write("");
                if (i % 10 == 0) {
                    writer.flush();//写入时批量刷新管道缓存
                }
            }
        } catch (IOException e) {
            if (file != null) {
                try {
                    //关闭流
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    //文件的读写
    public void readerWriter() {
        File file = new File("src/com/example/demo/...");
        Reader reader = null;//读取文件
        Writer writer = null;//写入文件
        try {
            reader = new FileReader(file);
            writer = new FileWriter(new File("..."));
            char[] cn = new char[1024];
            int len = -1;
            while ((len = reader.read(cn)) != -1) {
                //System.out.println(reader);
                writer.write(cn, 0, len);
            }
            writer.flush();//手动刷新流
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //后执行的流，先关闭
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}
