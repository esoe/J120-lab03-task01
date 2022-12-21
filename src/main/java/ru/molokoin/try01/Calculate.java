package ru.molokoin.try01;

import ru.molokoin.try01.archive.WrongOperationTypeException;

public class Calculate {
    public StringBuilder input;//что отображается на дисплее, передается для показа пользователю
    public Double memory;//что хранится в памяти
    public Operation operation;

    Calculate(){
        input = new StringBuilder();//исходное состояние дисплея
        memory = 0.0;//исходное состояние памяти
        operation = Operation.SUMM;//операция исходная (прибавляем введенные пользователем днные к нулю)
    }
    /**
     * Пользователь вводит данные:
     * - нажимает кнопки ввода чисел
     * - вызывает исполнение доступных операций operation.perform()
     * - вызывает команду clear()
     * 
     * @param value
     */
    public void input(String value){
        /**
         * дописываем введенные пользователем символы в поле ввода:
         * - если введенная строка не является командой
         */
        switch (Operation.fromValue(value)) {
            case SUMM:
                System.out.println("Выполняем: Operation.SUMM");
                try {
                    memory = operation.perform(memory, Double.valueOf(input.toString()));
                } catch (NumberFormatException | WrongOperationTypeException e) {
                    System.out.println("Ошибка приведения данных: " + e.getMessage());
                    e.printStackTrace();
                }
                this.operation = Operation.SUMM;
                input = new StringBuilder();
                break;
            case SUBTRACT:
                this.operation = Operation.SUBTRACT;
                //memory = memory - Double.valueOf(input.toString());
                break;
            case MULTIPLY:
                this.operation = Operation.MULTIPLY;
                //memory = memory * Double.valueOf(input.toString());
                break;
            case DIVIDE:
                this.operation = Operation.DIVIDE;
                //memory = memory / Double.valueOf(input.toString());
                break;
            case EQUALY:
                this.operation = Operation.EQUALY;
                //
                break;
            case CLEAR:
                this.operation = Operation.CLEAR;
                break;
            default:
                /**
                 * добавить проверку на случй введенных данных отличных от цифр и "."
                 * в случае ввода с графического интерфейса - не обязательно
                 */
                input.append(value);
        }
    }
}
