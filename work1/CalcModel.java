public class CalcModel {
    private double result;
    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void performOperation(double num1, double num2) {
        result = operationStrategy.performOperation(num1, num2);
    }

    public double getResult() {
        return result;
    }
}