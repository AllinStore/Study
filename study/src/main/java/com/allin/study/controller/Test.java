package com.allin.study.controller;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //封装父目录的对象
        File parent = new File("D:\\test");
        //调用函数查找文件或者文件夹
        scanFolderAndFile(parent);
    }
    //自定义函数扫描文件或者文件夹
    public static void scanFolderAndFile(File parent) {
        //通过父目录对象调用函数获取所有儿子的File数组
        File[] dirs = parent.listFiles();
        //循环遍历所有的儿子,dir表示父目录D:\\test的每一个儿子
        for (File dir : dirs) {
            /*
             * 判断获取的儿子dir是否是文件夹
             * 如果是文件夹，那么继续扫描或者查找儿子下面的所有文件或者文件夹
             * 以此类推
             * 如果不是文件夹，那么肯定是文件，判断后缀名是否是.jpg
             * 		如果是.jpg 则输出其绝对路径
             */
            if (dir.isDirectory()) {
                //说明是文件夹  继续找儿子下面的文件或者文件夹 执行扫描函数
                scanFolderAndFile(dir);
            } else {
                /*
                 * 说明不是文件夹，是文件,我们判断是否是.jpg
                 * dir.getName()表示获取文件的名字  mm.jpg
                 */
                if (dir.getName().endsWith(".jpg")) {
                    //说明文件的后缀名是.jpg 输出其绝对路径
                    System.out.println(dir.getAbsolutePath());
                }
            }
        }
    }
}
