package ru.molokoin;

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
                this.operation = Operation.SUMM;
                System.out.println("Выполняем: Operation.SUMM");
                break;
            case SUBTRACT:
                this.operation = Operation.SUBTRACT;
                break;
            case MULTIPLY:
                this.operation = Operation.MULTIPLY;
                break;
            case DIVIDE:
                this.operation = Operation.DIVIDE;
                break;
            case EQUALY:
                this.operation = Operation.EQUALY;
                break;
            default:
                input.append(value);
        }
        
    }

}
