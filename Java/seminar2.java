package Java;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class seminar2 {

    private final float TIME = 0;

    public static void main(String[] args) {
        

        String str = "Hello!";
        // str = str.replace("ll", "oo");

        StringBuilder builder = new StringBuilder();
        // str = builder.toString();
        
        // builder.append(true);

        // System.out.println(builder);
        // builder.append(true).append(" !=").append(false);
        // builder.deleteCharAt(0); удаляет первый элемент массива
        // builder.reverse(); разворачивает строку

        // builder.insert(builder.length()/2, 7.34f); вставить что-то в массив
        // System.out.println(builder);
        
        // long begin = System.currentTimeMillis();

        // for (int i = 0; i< 1000; i++) {
        //     str += Character.getName(i);
        // }

        // long end = System.currentTimeMillis();
        // for (int i = 0; i<1000; i++) {
        //     builder.append(Character.getName(i));
        // }
        // end = System.currentTimeMillis();
        // System.out.println(end - begin);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите что-то: ");
        // String in = scanner.nextLine();
        // System.out.println(in);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1ю строку: ");
        
        StringBuilder lineOne = new StringBuilder(scanner.nextLine());

        System.out.println("Введите 2ю строку: ");
        StringBuilder lineTwo = new StringBuilder(scanner.nextLine());

        if(lineOne.toString().equals(lineTwo.toString())) {
            // System.out.println(lineOne.toString().replace(lineTwo.toString(), "найденная подстрока удалена"));
            System.out.println("ура");

            
        }else System.out.println("не найдено");



        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Введи 1-ю строку: ");

        // StringBuilder lineOne = new StringBuilder(scanner.nextLine());

        // System.out.println("Введи 2-ю строку: ");
        // StringBuilder lineTwo = new StringBuilder(scanner.nextLine());

        // if (lineOne.toString().contains(lineTwo.toString())) {
        //     int startIndex = lineOne.indexOf(lineTwo.toString());
        //     int endIndex = startIndex + lineTwo.length();
        //     System.out.println(startIndex);
        //     System.out.println(endIndex);
        //     System.out.println(lineOne.replace(startIndex, endIndex, "Good code!"));

        // } else System.out.println("Подстрока не найдена");

        // StringBuilder lineOne = new StringBuilder("Hello Java!");
        // String lineTwo = "Hello Java!";

        // long begin = System.currentTimeMillis();
        // System.out.println(lineOne.replace());
        // long end = System.currentTimeMillis();







    }
    
}
