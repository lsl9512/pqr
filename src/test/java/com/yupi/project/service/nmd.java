package com.yupi.project.service;

import org.junit.jupiter.api.Test;

public interface nmd {
    void like();
}


class gg{
    public static void main(String[] args) {
        nmd n=new nmd() {
            @Override
            public void like() {
                System.out.println("jjjj");
            }
        };

        n.like();
    }
}

class in{
    @Test
  public  void test(){
      f1(new Il() {
          @Override
          public void show() {
              System.out.println("ggg");
          }
      });
  }

    public  static  void  f1(Il il){
        il.show();
    }
}

interface  Il{
    void  show();
}