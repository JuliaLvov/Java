package OOP.HM5second;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    
    public double getNumber(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    

  

    public void print(Double data, String title){
        System.out.printf("%s %f\n", title, data);
    }

    
    public void print(ComplexNumbers data, String title){
        System.out.printf("%s %s\n", title, data);
    }
    
}
