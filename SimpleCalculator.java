public class SimpleCalculator {

    private double firstNumber;     
    private double secondNumber;    

    // == Getters and Setters ==
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        if (Double.isFinite(firstNumber)) {
            this.firstNumber = firstNumber;
        } else {
            System.out.println("Invalid number input.");
        }
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        if (Double.isFinite(secondNumber)) {
            this.secondNumber = secondNumber;
        } else {
            System.out.println("Invalid number input.");
        }
    }

    // == Public Methods ==
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;  // Return NaN for division by zero
        }
        return firstNumber / secondNumber;
    }

    @Override
    public String toString() {
        return String.format("Calculator [FirstNumber: %.2f, SecondNumber: %.2f]", firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(10);
        calc.setSecondNumber(0);

        System.out.println(calc);
        System.out.println("Addition: " + calc.getAdditionResult());
        System.out.println("Subtraction: " + calc.getSubtractionResult());
        System.out.println("Multiplication: " + calc.getMultiplicationResult());
        System.out.println("Division: " + calc.getDivisionResult());
    }
}
