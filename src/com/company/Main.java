package com.company;
// Developer Name: Keyvan Derakhshan Nik
public class Main {

    public static void main(String[] args) {
	    CeilingFan cf = new CeilingFan();
        useFan(cf);
    }

    public static void useFan(FanI f){
        f.speedUp();
        f.speedUp();
        f.speedUp();
        f.speedUp();
        f.changeDirection();
        f.changeDirection();
    }
}
