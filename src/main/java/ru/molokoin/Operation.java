package main.java.ru.molokoin;

public enum Operation {
    SUMM ("+") {
        @Override
        public Double perform(Double result, Double current) {
            return result + current;
        }
    },
    SUBTRACT ("-") {
        @Override
        public Double perform(Double result, Double current) {
            return result - current;
        }
    },
    MULTIPLY ("*") {
        @Override
        public Double perform(Double result, Double current) {
            return result * current;
        }
    },
    DIVIDE ("/") {
        @Override
        public Double perform(Double result, Double current)  {
            return result / current;
        }
    },
    EQUALY ("=") {
        @Override
        public Double perform(Double result, Double current)  {
            return result;
        }
    },
    NOT_SUPORTED("") {
        @Override
        public Double perform(Double result, Double current) throws WrongOperationTypeException{
            throw new WrongOperationTypeException();
        }
    };
    public abstract Double perform(Double result, Double current)throws WrongOperationTypeException;

    public final String value;
    Operation (final String value){
        this.value = value;
    }
    public static Operation fromValue(String value) {
        for (final Operation operation : values()) {
           if (operation.value.equalsIgnoreCase(value)) {
              return operation;
           }
        }
        return NOT_SUPORTED;
     }
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
}
