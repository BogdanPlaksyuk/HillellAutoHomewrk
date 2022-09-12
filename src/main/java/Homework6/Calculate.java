package Homework6;

import java.util.ArrayList;
import java.util.List;

public class Calculate {

    public static void main(String[] args) {
        List<String> expression = new ArrayList<>();
        expression.add("5");
        expression.add("PLuS");
        expression.add("-5");
        vivod(prepareResults(expression, calculate(expression)));
    }

    public static Float calculate(List<String> list) {
        Operations operation = Operations.valueOf(list.get(1).toUpperCase());
        float var1 = Float.parseFloat(list.get(0));
        float var2 = Float.parseFloat(list.get(2));
        switch (operation) {
            case PLUS:
                return (var1 + var2);
            case MINUS:
                return (var1 - var2);
            case MULTIPLY:
                return (var1 * var2);
            case DIVIDE:
                if (var2 == 0) {
                    System.out.println("Can not divide by zero");
                    return null;
                } else {
                    return (var1 / var2);
                }
        }
        return null;
    }

    public static String prepareResults(List<String> inputData, Float result) {
        Operations operation = Operations.valueOf(inputData.get(1).toUpperCase());
        switch (operation){
            case PLUS:
                inputData.add(1, Operations.PLUS.value);
                break;
            case MINUS:
                inputData.add(1, Operations.MINUS.value);
                break;
            case MULTIPLY:
                inputData.add(1, Operations.MULTIPLY.value);
                break;
            case DIVIDE:
                inputData.add(1, Operations.DIVIDE.value);
                break;
        }
        inputData.add("=");
        inputData.add(result.toString());
        String resultStr = inputData.toString();
        return resultStr.replace(",", "");
    }

    public static void vivod(String resultForVivod) {
        System.out.println(resultForVivod);
    }

    enum Operations {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/");
        private String value;

        Operations(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
}


