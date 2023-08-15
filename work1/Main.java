public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcInputView inputView = new CalcInputView();
        CalcOutputView outputView = new CalcOutputView();
        CalcController controller = new CalcController(model, outputView);

        String operation = inputView.getOperation();
        double num1 = inputView.getOperand();
        double num2 = inputView.getOperand();

        controller.performOperation(operation, num1, num2);
    }
}