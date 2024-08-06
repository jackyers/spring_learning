package com.zyh;

import org.junit.Test;

import java.io.File;

/**
 * @author GG_B
 * @version 1.0
 */
public class Directory {
    @Test
    public void t1(){
//        判断文件是否存在，若存在就删除该文件
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void t2(){
//        判断目录是否存在，若存在就删除该目录
        String directoryPath = "d:\\demo02";
        File file = new File(directoryPath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("目录不存在");
        }
    }

    @Test
    public void t3(){
//        判断目录是否存在，若不存在就创建该目录
        String directoryPath = "d:\\demo1\\a";
        File file = new File(directoryPath);
        if (file.exists()){
            System.out.println("目录已经存在了");
        }else {
//            创建多级目录，一级目录就用mkdir()方法
            if (file.mkdirs()){
                System.out.println("目录创建成功");
            }else {
                System.out.println("目录创建失败");
            }
        }
    }
}
