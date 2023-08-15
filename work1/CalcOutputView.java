/*
 * Принцип единой ответственности(Single responsibility principle).
 * В public class CalcOutputView происходит только вывод результатов.
 * 
 * Принцип разделения интерфейса(Interface segregation principle). 
 * Принцип разделения интерфейса реализован путем создания отдельных интерфейсов для операций OperationStrategy и визуализации CalcOutputView, 
 * аким образом у пользователя будут работать только те методы, которые ему необходимы, что позволяет лучше поддерживать программу и расширять ее в будущем.
 */

public class CalcOutputView {
    public void displayResult(double result) {
        System.out.printf("Результат: " + "%.2f", result);
        System.out.println();
        System.out.println("Конец операции!");
    }
}