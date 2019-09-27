package com.lambton;

public class MainThread {
    public static void main(String[] args) {
        FristThread f1 = new FristThread("A");
        FristThread f2 = new FristThread("b");
        System.out.println("---------Start---------");
        f1.start();
        f2.start();
        System.out.println("=======end=======");


    }
}
