package com.company;

public class CeilingFan implements FanI{
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    private int speed;
    private boolean direction;

    @Override
    //Cord 2
    public void changeDirection() {
        this.setDirection(!this.isDirection());
        showCondition();
    }

    @Override
    //Cord1
    public int speedUp() {
        if (this.getSpeed() ==3){
            this.setSpeed(0);
        }else {
            this.setSpeed(this.getSpeed()+1);
        }
        showCondition();
        return this.getSpeed();
    }

    @Override
    public void showCondition() {
        String direction;
        if (isDirection()){
            direction ="Clock wise";
        }else{
            direction = "Non clock wise";
        }
        System.out.println(this.getSpeed() + " round(s)/sec in "+ direction + " direction.");
    }
}
