package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModulusClock();
    }

    public static void ModulusClock() {

        Scanner keyboard;
        int hour;
        int minutes;

        keyboard = new Scanner(System.in);
        System.out.println("Give me an hour in the day. 1-24");
        hour = keyboard.nextInt();
        System.out.println("Now give me any amount of minutes.");
        minutes = keyboard.nextInt();
        System.out.println(+hour);
        System.out.println(+minutes);
    }
}
