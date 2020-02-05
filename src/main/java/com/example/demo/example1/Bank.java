package com.example.demo.example1;


interface RBI {

    void deposit();

    void withraw();

    public default void s() {

    }


}


class SBI implements RBI {

    @Override
    public void deposit() {

        System.out.println("  SBI deposit)");

    }

    @Override
    public void withraw() {
        System.out.println(" SBI  withraw");
    }
}


public class Bank {

    public static void main(String[] args) {

        RBI a = new SBI();

        a.deposit();

    }


}