package main.java.ru.molokoin;

/**
 * Класс хранит данные введенные пользователем и по запросу формирует ответ
 * варианты реализации:
 * 1. Данные могут храниться в виде строки, которая будет разбираться при формировании ответа
 * 2. Данные могут храниться в виде списка "Значение : операция"
 * 3. Храниться может только уже вычисленное значение и наименование следующей операции
 */
public class Calculator implements iCalculator{
    private Double resultValue;//результат проведенных вычислений
    private Double currentValue;
    private Operation operation;//текущая операция
    public Calculator (){
        /**
         * Первой операцией прибавляем к нулю введенное пользователем число,
         * потому задаем значения по умолчанию.
         */
        clear();
    }
    /**
     * Сбрасывает все данные, введенные пользователем,
     * устанавливает значения по умолчанию
     */
    public Calculator clear(){
        operation = Operation.SUMM;
        resultValue = 0.0;
        currentValue = 0.0;
        return this;
    }
    /**
     * рассчитываем новое значение resultValue
     * - сравниваем текущую операцию с допустимыми
     * - вызываем нужный метод, для расчета результата
     */
    public void count(){
        try {
            resultValue =  operation.perform(resultValue, currentValue);
        } catch (WrongOperationTypeException e) {
            System.out.println("Не верно указан тип операции: " + e.getMessage());
            //e.printStackTrace();
        }
    }
    /**
     * 
     * @param currentValue the currentValue to set
     */
    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
    /**
     * передана от пользователяоперация,
     * записываем ее в поле текущей операции,
     * однако:
     * - передача новой операции свидетельствует,
     * что заполнение поля текущего значения завершено и можно выполнять предыдущую операцию,
     * result = result "operation" current
     * @param operation the operation to set
     * @throws WrongOperationTypeException
     */
    public void setOperation(String operation) throws WrongOperationTypeException {
        switch (Operation.fromValue(operation)) {
            case SUMM:
                this.operation = Operation.SUMM;
                break;
            case SUBTRACT:
                this.operation = Operation.SUBTRACT;
                break;
            case MULTIPLY:
                this.operation = Operation.SUMM;
                break;
            case DIVIDE:
                this.operation = Operation.SUMM;
                break;
            default:
                throw new WrongOperationTypeException();
        }
    }
}
