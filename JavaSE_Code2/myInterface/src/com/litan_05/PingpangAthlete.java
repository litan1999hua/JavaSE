package com.litan_05;

public class PingpangAthlete extends Athlete implements SpeakEnglish {
    public PingpangAthlete() {
    }

    public PingpangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃乒乓球运动员餐");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
