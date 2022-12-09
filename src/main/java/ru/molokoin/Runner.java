package main.java.ru.molokoin;

public class Runner {
    Calculator calculator;
    SwingFace mainframe;
    public Runner(){
        init();
    }
    public void init(){
        mainframe = new SwingFace();
        calculator = new Calculator();
    }

    public static void main(String[] args) {
        System.out.println("Программа калькулятор запущена и готова к использованию ...");
        new Runner();
    }
}
