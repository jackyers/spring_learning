package com.zyh;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author GG_B
 * @version 1.0
 */
public class FileCreate {
    @Test
    public void create01(){
//        方式1new File(String pathName)
        String filePath = "d://news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create02(){
//        方法2new File(parentFile,fileName)
        File parentFile = new File("d://");
        String fileName = "news2.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create03(){
        String parentPath = "d://";
        String fileName = "news3.txt";
        File file = new File(parentPath,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
