import java.util.*;

import static java.util.Collections.max;

public class Day3 {
    private static final Scanner line = new Scanner(System.in);
    private static final List<Integer> batteries = new ArrayList<>();
    private static int result = 0;
    public static void main(String[] args) {
        while (true) {
            getBankToInt();

            int firstValue = -1;
            int firstIndex = -1;

            for (int value : batteries.subList(0, batteries.size()-1)) {
                if (value > firstValue) {
                    firstValue = value;
                    firstIndex = batteries.indexOf(value);
                }
            }
            int secondValue = max(batteries.subList(firstIndex+1, batteries.size()));

            sumIntVoltage(firstValue, secondValue);
            System.out.println(result);
        }
    }


    private static void sumIntVoltage(int firstValue, int secondValue) {
        String first = String.valueOf(firstValue);
        String second = String.valueOf(secondValue);
        result += Integer.parseInt(first+second);
    }

    private static void getBankToInt() {
        batteries.clear();
        String bank = line.nextLine();
        char[] digits = bank.toCharArray();
        for (char digit : digits) batteries.add(Integer.parseInt(String.valueOf(digit)));
    }
}
