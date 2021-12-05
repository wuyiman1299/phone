package com.company;

public class Domo {
    public static void main(String[] args) {
        Phone iphoneSE3 = new Phone();
        iphoneSE3.width = 25;
        iphoneSE3.high = 55;
        iphoneSE3.weight = 155;
        iphoneSE3.color = "粉色";

       Phone onePlus = new Phone(26,56,156,"紫色");
        Phone onePlus1 = new Phone(26,56,156,"紫色");

        System.out.println(iphoneSE3);
        System.out.println(onePlus);

        System.out.println();

    }

}
