package com.company;

public class testeSecond {

    int a;
    int b;

    public testeSecond() {
    }

    public testeSecond(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculaAB(){
        return this.a + this.b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
