import java.util.Scanner;
import static java.lang.Math.*;

public class Day1 {
    private static final Scanner line = new Scanner(System.in);
    private static int password = 0;
    private static int pointer = 50;

    public static void main(String[] args) {
        while (true) {
            getNewPointer();
            adjustPointer();
            if (pointer == 0) password++;
            System.out.println(password);
        }
    }

    private static void getNewPointer() {
        String move = line.nextLine();
        int numberMove = Integer.parseInt(move.substring(1));
        if (move.startsWith("R")) pointer += numberMove;
        if (move.startsWith("L")) pointer -= numberMove;
    }

    private static void adjustPointer() {
        pointer = floorMod(pointer, 100);
    }
}
