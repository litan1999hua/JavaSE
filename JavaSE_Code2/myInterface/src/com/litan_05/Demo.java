package com.litan_05;
/*
    测试类
 */
public class Demo {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("姚明",35);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.eat();
        bc.teach();
        System.out.println("----------");

        BasketballAthlete ba = new BasketballAthlete("林书豪",25);
        System.out.println(ba.getName() + "," + ba.getAge());
        ba.eat();
        ba.study();
        System.out.println("----------");

        PingpangCoach pc = new PingpangCoach("刘国梁",43);
        System.out.println(pc.getName() + "," + pc.getAge());
        pc.eat();
        pc.teach();
        pc.speakEnglish();
        System.out.println("----------");

        PingpangAthlete pa = new PingpangAthlete("马龙",25);
        System.out.println(pa.getName() + "," + pa.getAge());
        pa.eat();
        pa.study();
        pa.speakEnglish();
    }
}
