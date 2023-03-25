package OOP.HM5second;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner){
        this.scanner = scanner;
    }

    public String selectCalc() {
        System.out.print("""
                \nМЕНЮ приложения 'Калькулятор'
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. вычисление комплексных чисел 
                2. вычисление рациональных чисел
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }

    public String selectOperation(){
        System.out.println("""
            \nМЕНЮ операций 'Калькулятор'
            --------------------------------------
            Выберите действие:
            --------------------------------------
            1. сумма
            2. вычитание
            3. умножение
            4. деление
            
            --------------------------------------
            0. Выход
                """);
        return scanner.nextLine();

    }
    
}
