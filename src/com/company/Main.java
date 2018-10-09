package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("How old are you?");
        String age= input2.nextLine();
        System.out.println("Hello "+ name+"and you are "+age+"years old");


    }
}
