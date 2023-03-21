package OOP.HM5;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    
    public double getNumber(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(double data, String title){
        System.out.printf("%s %f", title, data);
    }

    // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите что-то: ");
        // String in = scanner.nextLine();
        // System.out.println(in);
}
