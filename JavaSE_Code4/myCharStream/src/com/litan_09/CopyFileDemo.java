package com.litan_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args)  {

    }

    //抛出处理
    //JDK9
    public static void method4()throws IOException{
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");
        try(fr;fw) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //JDK7
    public static void method3(){
        try(FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");) {

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //try ... catch ... finally
    public static void method2(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void method1()throws IOException{
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chs = new char[1024];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }

        fw.close();
        fr.close();
    }
}
