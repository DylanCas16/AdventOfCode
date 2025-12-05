package Day1;

import java.util.Scanner;

import static java.lang.Math.floorMod;

public class Part2 {
    private static final Scanner line = new Scanner(System.in);
    private static int password = 0;
    private static int pointer = 50;

    public static void main(String[] args) {
        while (true) {
            movePointer();
            System.out.println(password);
        }
    }

    private static void movePointer() {
        String move = line.nextLine();
        int numberMove = Integer.parseInt(move.substring(1));
        if (move.startsWith("R")) moveToRight(numberMove);
        if (move.startsWith("L")) moveToLeft(numberMove);
    }

    private static void moveToLeft(int numberMove) {
        for (int i=0; i<numberMove; i++) {
            pointer--;
            adjustPointer();
            checkPointer();
        }
    }

    private static void moveToRight(int numberMove) {
        for (int i=0; i<numberMove; i++) {
            pointer++;
            adjustPointer();
            checkPointer();
        }
    }

    private static void checkPointer() {
        if (pointer == 0) password++;
    }

    private static void adjustPointer() {
        pointer = floorMod(pointer, 100);
    }
}
