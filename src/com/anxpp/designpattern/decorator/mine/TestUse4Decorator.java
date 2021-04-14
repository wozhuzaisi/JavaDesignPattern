package com.anxpp.designpattern.decorator.mine;

/**
 * @program: JavaDesignPattern
 * @description: 测试类
 * @author: djp
 * @create: 2021-04-14 19:09
 **/
public class TestUse4Decorator {
    public static void  main(String[] args){
        // 原饮料
        IDrink myDrink = new MyDrink();
        myDrink.getMaterial();

        // 加糖
        myDrink = new SugarDrink(myDrink);
        myDrink.getMaterial();

        // 加牛奶
        myDrink = new MilkDrink(myDrink);
        myDrink.getMaterial();
    }
}