package com.litan_04;
/*
    public final void join​()throws InterruptedException等待这个线程死亡。
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("吴三桂");
        tj2.setName("尚可喜");
        tj3.setName("耿精忠");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
