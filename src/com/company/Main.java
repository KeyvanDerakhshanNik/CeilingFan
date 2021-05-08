package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CeilingFan cf = new CeilingFan();
        checkFan(cf);

    }
    public static void checkFan(FanI f){
        f.speedUp();
        f.showCondition();
        f.changeDirection();
        f.showCondition();
    }
}
