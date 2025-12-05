package Day2;

import java.util.*;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static List<String> products;
    private static long result = 0;

    public static void main(String[] args) {
        getInput();

        for (String sequence : products) {
            List<String> codes = List.of(sequence.split("-"));

            long numCode = Long.parseLong(codes.get(0));
            long numLastCode = Long.parseLong(codes.get(1));

            while (numCode <= numLastCode) {
                if (checkValid(numCode)) result += numCode;
                numCode++;
            }
        }
        System.out.println(result);
    }

    private static void getInput() {
        String inputString = input.nextLine();
        products = List.of(inputString.split(","));
    }

    private static boolean checkValid(long numCode) {
        String code = String.valueOf(numCode);
        int halfLength = code.length()/2;

        String firstHalf = code.substring(0, halfLength);
        String lastHalf = code.substring(halfLength);

        return firstHalf.equals(lastHalf);
    }
}
