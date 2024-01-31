package org.example;

public class Main {
    public static void main(String[] args) {

        //Print out to Console
        System.out.println("Hello world");

        //Create POJO and call function
        Messenger msg = new Messenger();
        System.out.println(msg.sendMessage());

    }
}
