package com.zyh;

import org.junit.Test;

import java.io.File;

/**
 * @author GG_B
 * @version 1.0
 */
public class FileInformation {
    @Test
    public void info(){
        File file = new File("d:\\news1.txt");
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父级目录" + file.getParent());
        System.out.println(" 文件大小(字节)" + file.length());
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("是不是一个文件：" + file.isFile());
        System.out.println("是不是一个目录：" + file.isDirectory());
    }
}
