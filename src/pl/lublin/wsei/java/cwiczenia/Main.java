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
        String BIN2,HEX2;
        BIN2 = leftPad(BIN, '0', 8);
        HEX2 = leftPad(HEX, '0', 4);
        System.out.printf("BIN = " + BIN2 + "\nHEX = " + HEX2);

    }
    public static String leftPad(String aText, char aChar, int aWidth){
        String res = aText;

        for (int i = 0; i < aWidth - aText.length();i++)
            res = aChar + res;
        return res;


    }

}