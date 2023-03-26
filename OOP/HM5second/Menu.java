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

    public String selectOperation() {
        System.out.print("""
                
                Выберите действие:
                --------------------------------------
                1. Сложение 
                2. Вычитание  
                3. Умножение
                4. Деление
                0. Выход
                """);
        return scanner.nextLine();
    }

    
    
}
