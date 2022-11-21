package calculator;

public class Calculator {
    public static String add(String N1, String N2) {

        double D1 = Double.parseDouble(N1);
        double D2 = Double.parseDouble(N2);

        double result = D1 + D2;

        return String.valueOf(result);

    }
}
