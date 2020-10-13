package com.litan_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    需求：请写程序实现猜数字小游戏，只能试玩三次，如果还想玩，提示：游戏试玩已结束，想玩请充值(www.tencent.com)

    思路：
        1：写一个游戏类，实现猜数字小游戏
        2.写一个测试类
            1.从文件中读取数据到Properties集合，用Load方法实现
                文件已经存在：game.txt
                里面有一个数据值：count=0
            2.通过Properties获取玩游戏的次数
            3.判断游戏是否已到三次
                到三次，提示：游戏试玩已结束，想玩请充值(www.tencent.com)
                不到三次
                    玩游戏
                    次数+1，重写文件，用Properties的store（）方法实现
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据到Properties集合，用Load方法实现
        Properties prop = new Properties();

        FileReader fr = new FileReader("myOtherStream\\game.txt");
        prop.load(fr);
        fr.close();

        //通过Properties获取玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        //判断游戏是否已到三次
        //                到三次，提示：游戏试玩已结束，想玩请充值(www.tencent.com)
        //                不到三次
        //                    玩游戏
        //                    次数+1，重写文件，用Properties的store（）方法实现
        if(number >= 3){
            System.out.println("游戏试玩已结束，想玩请充值(www.tencent.com)");
        }else{
            GuessNumber.start();

            number ++;

            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("myOtherStream\\game.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
