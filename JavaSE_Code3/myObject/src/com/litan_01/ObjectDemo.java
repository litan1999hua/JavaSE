package com.litan_01;
/*
     建议所有子类覆盖此方法。
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s);//com.litan_01.Student@4554617c
        System.out.println(s.toString());

        /*public void println(Object x) {//x = s
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }*/

        /*public static String valueOf(Object obj) {//obj = x;
            return (obj == null) ? "null" : obj.toString();
        }*/

        /*public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/

        /*public void println(String x) {
            synchronized (this) {
                print(x);
                newLine();
            }
        }*/
    }
}
