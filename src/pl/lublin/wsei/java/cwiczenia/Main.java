package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("DEC: ");
        Scanner input = new Scanner(System.in);
        int DEC = 0;
        DEC = input.nextInt();
        String BIN, HEX;
        HEX = Integer.toHexString(DEC);
        BIN = Integer.toBinaryString(DEC);
        System.out.printf("BIN = " + BIN + "\nHEX = " + HEX);
    }

}
