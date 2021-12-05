package com.company;

public class Domo02 {
    String name;
    int age;

    public void fun() {
        System.out.println("普通的幸运方法");
    }

    class  Inner{
        int sex ;
        double high ;
        public  void  fun01() {
            System.out.println("内部类中的普通方法");
        }
    }
}
