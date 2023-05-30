package coordinate.calculatorview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String NATURAL_NUMBER = "[0-9][0-9]*";
    private static final String POINT = "\\((" + NATURAL_NUMBER + "," + NATURAL_NUMBER + ")\\)";
    private static final Pattern POINTS_PATTERN = Pattern.compile(POINT + "(?:-" + POINT + "){1,3}");

    public static void askPoints() {
        System.out.println("좌표를 입력하세요");
    }

    public static String getPoints() {
        try {
            String input = SCANNER.nextLine();
            Matcher matcher = POINTS_PATTERN.matcher(input);
            if (!matcher.find()) {
                throw new IllegalArgumentException("좌표 입력 형식이 맞지 않습니다.");
            }

            return input;
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
