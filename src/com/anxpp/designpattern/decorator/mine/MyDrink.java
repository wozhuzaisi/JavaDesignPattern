package com.anxpp.designpattern.decorator.mine;

/**
 * @program: JavaDesignPattern
 * @description: 初始饮料-水
 * @author: djp
 * @create: 2021-04-12 18:38
 **/
public class MyDrink implements IDrink{
    @Override
    public void getMaterial(){
       System.out.println("has water");
    }
}