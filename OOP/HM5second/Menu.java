package OOP.HM5second;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner){
        this.scanner = scanner;
    }

    public String selectCalc() {
        System.out.print("""
                \nменю калькулятора
                --------------------------------------
                Выберите режим работы:
                --------------------------------------
                1. вычисление комплексных чисел 
                2. вычисление рациональных чисел
                0. Выход
                """);
        return scanner.nextLine();
    }

    
    
}
