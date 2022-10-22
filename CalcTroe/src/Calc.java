public class Calc {
    public static double calc(double a, double b, String operator) {
        double sum;
        switch (operator) {
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "*":
                sum = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Nie dzielimy przez 0");
                } else
                    sum = a / b;
                break;
            default:
                throw new UnknownOperatorException("Bledny operator matematyczny");
        }
        return sum;
    }
}