package com.litan_05;

public class BasketballAthlete extends Athlete  {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃篮球运动员餐");
    }
}
