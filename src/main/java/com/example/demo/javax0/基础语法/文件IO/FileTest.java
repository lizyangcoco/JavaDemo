package com.example.demo.javax0.基础语法.文件IO;

import java.io.File;

/**
 * file 文件对象
 * Created by 李泽阳 on 2020/4/11 21:20
 */
public class FileTest {

    /**
     * 文件对象创建的四种方式
     * 1、路径+名称
     * 2、文件地址，文件名称
     * 3、文件路径
     * 4、文件路径对象，文件名称
     */
    public void fileGet() {
        File f = new File("D:\\txt.txt");
        File f2 = new File("D:\\package", "txt.txt");
        File f3 = new File("D:\\package");
        File f4 = new File(f3, "txt.txt");
    }

    /**
     * 文件创建删除
     * 1、创建文件
     * 2、创建文件目录级别
     * 3、删除文件，
     */
    public void fileCreateDelete() throws Exception {
        File f1 = new File("D\\txt.txt");
        boolean newFile = f1.createNewFile();//创建新的文件
        f1.exists();//判断文件是否存在


        File f2 = new File("D\\aaa\\ccc");
        f2.mkdir();//创建文件夹，只创建最后一级
        f2.mkdirs();//创建文件夹的全路径

        //程序删除不走回收站
        f2.delete();//删除文件目录下的最后级别
        //只有空目录才可删除
    }

    //文件的基本API方法
    public void filePath() throws Exception {
        File f1 = new File("D\\txt.txt");
        f1.getAbsolutePath();//获取文件的绝对路径
        f1.getPath();//获取文件的路径，怎么创建就是那个路径
        f1.getName();//获取文件的名称
        f1.length();//字节类型的文件大小
        f1.lastModified();//long型文件的最后修改时间
    }

    //获取文件对象
    public void getOther() {
        File[] files = File.listRoots();//获取磁盘的根目录
        File f1 = new File("D\\ccc");
        File[] files1 = f1.listFiles();
        for (File file : files1) {
            System.out.println(file);//所有子列表对象
        }
    }

    //对文件进行判断
    public void fileTest() {
        File f1 = new File("D\\txt.txt");
        f1.exists();//判断文件是否存在
        //如果是目录，就是false，是文件就是true
        boolean isFile = f1.isFile();//判断文件是否为文件
        boolean isDir = f1.isDirectory();//判断是否为文件夹
        boolean canRead = f1.canRead();//文件是否可读
        boolean canWrite = f1.canWrite();//文件是否可写
        f1.isHidden();//文件是否隐藏

    }

}
