package OOP.HM5second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        
        
        System.out.println("\nКалькулятор." );
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(v, new Menu(scanner));
        p.start();
    }
}
