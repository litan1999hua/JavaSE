package com.litan_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象。

    ObjectInputStream​(InputStream in) 创建从指定的InputStream读取的ObjectInputStream。

    Object readObject​() 从ObjectInputStream读取一个对象。
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectInputStream​(InputStream in) 创建从指定的InputStream读取的ObjectInputStream。
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));

        //Object readObject​() 从ObjectInputStream读取一个对象。
        Object obj = ois.readObject();

        Student s = (Student) obj;

        System.out.println(s.getName() + "," +s.getAge());

        //释放资源
        ois.close();
    }
}
