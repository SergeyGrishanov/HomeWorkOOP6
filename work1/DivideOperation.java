public class DivideOperation implements OperationStrategy {
    @Override
    public double performOperation(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }
}
