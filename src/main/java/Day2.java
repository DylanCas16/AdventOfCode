import java.util.*;

public class Day2 {
    private static final Scanner input = new Scanner(System.in);
    private static long result = 0;

    public static void main(String[] args) {
        String inputString = input.nextLine();
        List<String> products = List.of(inputString.split(","));

        for (String sequence : products) {
            List<String> codes = List.of(sequence.split("-"));

            long longCode = Long.parseLong(codes.get(0));
            long longLastCode = Long.parseLong(codes.get(1));

            while (longCode <= longLastCode) {
                String code = String.valueOf(longCode);
                int halfLength = code.length()/2;

                String firstHalf = code.substring(0, halfLength);
                String lastHalf = code.substring(halfLength);
                if (firstHalf.equals(lastHalf)) result += longCode;

                longCode++;
            }
        }
        System.out.println(result);
    }
}
