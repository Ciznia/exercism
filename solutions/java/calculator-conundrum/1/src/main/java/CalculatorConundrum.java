class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        return String.valueOf(operand1) + " " + operation + " " + String.valueOf(operand2) + " = "
                + switch (operation) {
                    case "+" -> String.valueOf(operand1 + operand2);
                    case "*" -> String.valueOf(operand1 * operand2);
                    case "/" -> {
                        if (operand2 == 0)
                            throw new IllegalOperationException("Division by zero is not allowed",
                                    new ArithmeticException());
                        yield String.valueOf(operand1 / operand2);
                    }
                    default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                };
    }
}
