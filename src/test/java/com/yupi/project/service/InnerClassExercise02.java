package com.yupi.project.service;

import java.util.Scanner;

public class InnerClassExercise02 {

    public static void main(String[] args) {
        Cellphone cellphone=new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦！！！");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了！！！");
            }
        });
    }
}

interface  Bell{
    void ring();
}

class  Cellphone{

    public void alarmclock(Bell bell){
        int gsg=0;
        bell.ring();


    }
}

class jjjj{
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
            //快捷键 alt ctrl t
        try {
            int res=num1/num2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("程序死掉了...");
    }
}


class pqr{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        int num=0;
        while (true){
            try {
                System.out.println("请输入数字");
                num=scanner.nextInt();
                return;
            } catch (Exception e) {
                System.out.println("请输入整数哦");

            }

        }
    }
}