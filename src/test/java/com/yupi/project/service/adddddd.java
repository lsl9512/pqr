package com.yupi.project.service;

public class adddddd {
    public static void main(String[] args) {

        int age=11111;
        if(!(age>=18&& age<=120)){
            System.out.println("ggggggggg");
            throw  new AgeException("年龄需要在18~20之间");



            String
        }

        System.out.println("你的年龄范围是正常的");
    }
}


class AgeException extends RuntimeException{
    public AgeException (String message){
        super(message);
    }

}
