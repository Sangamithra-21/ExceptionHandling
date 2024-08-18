package Assignment_16_ExceptionHandling;

public class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}

class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        String res = "";


        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }


        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }


        switch (operation) {
            case "+":
                int sum = operand1 + operand2;
                res = operand1 + " + " + operand2 + " = " + sum;
                break;

            case "*":
                int mul = operand1 * operand2;
                res = operand1 + " * " + operand2 + " = " + mul;
                break;

            case "/":
                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException("/ by zero"));
                }
                int div = operand1 / operand2;
                res = operand1 + " / " + operand2 + " = " + div;
                break;

            default:

                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return res;
    }
}

