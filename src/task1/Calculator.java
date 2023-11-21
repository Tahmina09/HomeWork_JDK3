package task1;

public class Calculator {
    public static <T extends Number> double sum (T firstNumber, T secondNumber){
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <T extends Number> double multiply(T firstNumber, T secondNumber) {
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public static <T extends Number> double divide(T firstNumber, T secondNumber) {
        if (secondNumber.doubleValue() == 0 || firstNumber.doubleValue() == 0) {
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }

    public static <T extends Number> double subtract(T firstNumber, T secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }
}
