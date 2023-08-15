/*
 * Принцип инверсии зависимостей(Dependency inversion principle).
 * В классе CalcController происходит инвертирование зависимостей от классов CalcModel и CalcOutputView. 
 * Вместо того чтобы создавать их методы внутри CalcController, мы получаем их через конструктор.
 */

public class CalcController {
    private CalcModel model;
    private CalcOutputView view;

    public CalcController(CalcModel model, CalcOutputView view) {
        this.model = model;
        this.view = view;
    }

    public void performOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "1":
                model.setOperationStrategy(new AddOperation());
                break;
            case "2":
                model.setOperationStrategy(new SubtractOperation());
                break;
            case "3":
                model.setOperationStrategy(new MultyOperation());
                break;
            case "4":
                model.setOperationStrategy(new DivideOperation());
                break;
            default:
                System.out.println("Некорректная операция!");
        }
        model.performOperation(num1, num2);
        view.displayResult(model.getResult());
    }
}