package com.litan_04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    void load​(InputStream inStream) 从输入字节流读取属性列表（键和元素对）。
    void load​(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。

    void store​(OutputStream out, String comments)
    将此 Properties表中的此属性列表（键和元素对）以适合于使用 load(InputStream)方法加载到 Properties表格的格式写入输出流。

    void store​(Writer writer, String comments)
    将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
 */
public class PropertiesIODemo {
    public static void main(String[] args) throws IOException{
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        //void load​(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
        FileReader fr = new FileReader("myOtherStream\\fw.txt");
        prop.load(fr);

        Set<String> names = prop.stringPropertyNames();
        for(String key:names){
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("hfut001","林青霞");
        prop.setProperty("hfut002","刘德华");
        prop.setProperty("hfut003","周星驰");

        //void store​(Writer writer, String comments)
        //    将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
        FileWriter fw = new FileWriter("myOtherStream\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
