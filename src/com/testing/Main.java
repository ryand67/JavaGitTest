package com.testing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type something: ");
        String response = scanner.next();
        System.out.println(call(response));
    }

    public static String call(String res) {
        return res;
    }
}
