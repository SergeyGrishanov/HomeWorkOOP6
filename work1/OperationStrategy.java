/*
 * Принцип открытости-закрытости(Open-closed principle).
 * Интерфейс OperationStrategy для сбора вместе классов для реализации каждой операции: 
 * AddOperation, SubstractOperation, MulttyOperation, DivideOperation. 
 * Данный интерфейс может добавлять новые операции без изменения уже существующего кода.
 * 
 * Принцип подстановки Лисков(Liskov substitution principle).
 * Так же интерфейс OperationStrategy позволяет без добавление конкретных классов и изменения кода в классе CalcModel.
 */

public interface OperationStrategy {
    double performOperation(double num1, double num2);
}