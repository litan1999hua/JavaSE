package com.litan_01;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        //public static fianl PrintStream out()
        PrintStream ps = System.out;
        ps.print(100);
        ps.print("hello");
        ps.println(55);
        ps.println("a");

        //System.out本质是输出流
        System.out.println("vfvsv");
    }
}
