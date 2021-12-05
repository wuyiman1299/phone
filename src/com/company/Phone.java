package com.company;

public class Phone {
    public double width;
    public double high;
    public int weight;
    public String color;

    // 构造方法，用于在内存中创建对象
    public Phone() {
        System.out.println("我被构造了");
    }
    // 构造方法
    public Phone(double kuan,double gao, int zhong,String yanse) {
        width = kuan;
        high = gao;
        weight = zhong;
        color = yanse;
    }
    public void startUp() {
        System.out.println("手机在开机");
    }
    public void lockScreen() {
        System.out.println("手机在锁屏");
    }
    //
    public String toString() {
        return "{"+this.width+" "+this.high+" "+this.weight+" "+this.color+"}";
    }
    


}
