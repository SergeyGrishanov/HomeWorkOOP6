import java.util.Scanner;
/*
 * Принцип единой ответственности(Single responsibility principle).
 * В CalcInputVeiw происходит только получение данных от пользователя.
 */
public class CalcInputView {
    private Scanner scanner;

    public CalcInputView() {
        System.out.println("Запуск калькулятора!");
        scanner = new Scanner(System.in);
    }

    public String getOperation() {
        System.out.println("Выбирете оператор действия: 1 - '+', 2 - '-', 3 - '*', 4 - '/'");
        return scanner.nextLine();
    }

    public double getOperand() {
        System.out.println("Введите число: ");
        //return Double.parseDouble(scanner.nextLine());
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неправильное число");
            }
        }
    }
}