package com.anxpp.designpattern.decorator.mine;

/**
 * @program: JavaDesignPattern
 * @description: 饮料-糖
 * @author: djp
 * @create: 2021-04-12 18:38
 **/
public class SugarDrink implements IDrink{
    private IDrink iDrink;

    SugarDrink(IDrink iDrink){
        this.iDrink = iDrink;
    }
    @Override
    public void getMaterial(){
        iDrink.getMaterial();
        System.out.println("has sugar");
    }
}