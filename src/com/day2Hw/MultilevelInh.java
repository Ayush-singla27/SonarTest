package com.day2Hw;

class Person {
    void works() {
        System.out.println("does works");
    }
}

class Programmer extends Person {
    void prog() {
        System.out.println("does codes");
    }
}

class Intern extends Programmer {
    void assign() {
        System.out.println("does assignments");
    }
}

public class MultilevelInh {
    public static void main(String[] args) {
    	Intern myDog = new Intern();
        myDog.works();
        myDog.prog();
        myDog.assign();
    }
}
