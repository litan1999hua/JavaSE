package com.litan_01;
886
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    public class InetAddress extends Object implements Serializable此类表示Internet协议（IP）地址。

    static InetAddress getByName​(String host) 确定主机名称的IP地址。
    String getHostName​() 获取此IP地址的主机名。
    String getHostAddress​() 返回文本显示中的IP地址字符串。
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getByName​(String host) 确定主机名称的IP地址。
//        InetAddress address = InetAddress.getByName("lt1999);
        InetAddress address = InetAddress.getByName("192.168.1.119");

        //String getHostName​() 获取此IP地址的主机名。
        String name = address.getHostName();

        //String getHostAddress​() 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名:" + name);
        System.out.println("IP地址:" + ip);
    }
}
