import java.util.Scanner;



public class hw2 {

    static String str = "f";
    public static void main(String[] args) {
       

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите 1ю строку: ");
    StringBuilder lineOne = new StringBuilder(scanner.nextLine());

    System.out.println("Введите 2ю строку: ");
    StringBuilder lineTwo = new StringBuilder(scanner.nextLine());

    if (lineOne.toString().equals(lineTwo.toString())){
        System.out.println("Ура, строки полностью совпадают!");

    } else System.out.println("Что-то непонятное");


    System.out.println( lineOne.reverse());

        if (lineOne.reverse().toString().equals(lineTwo.toString())){

           System.out.println("Строки являются вращением друг друга");

        } else System.out.println("Строки не являются вращением друг друга");
        

    String str1 = "3";
    String str2 = "56";

    StringBuilder builder = new StringBuilder();
    StringBuilder builder1 = new StringBuilder();
    StringBuilder builder2 = new StringBuilder();
    str = builder.toString();
    str = builder1.toString();
    str = builder2.toString();
    
    System.out.println(builder.append(str1).append("+").append(str2).append("=").append(59));
    System.out.println();
    System.out.println(builder1.append(str1).append("-").append(str2).append("=").append("-").append(53));
    System.out.println();
    System.out.println(builder2.append(str1).append("*").append(str2).append("=").append(168));
    System.out.println();

    builder.deleteCharAt(4);
    System.out.println(builder.insert(4, " равно "));
    System.out.println();

    builder1.deleteCharAt(4);
    System.out.println(builder1.insert(4, " равно "));
    System.out.println();

    builder2.deleteCharAt(4);
    System.out.println(builder2.insert(4, " равно "));
    System.out.println();

    System.out.println(builder.replace(4,5, " равно "));
    System.out.println(builder1.replace(4,5, " равно "));
    System.out.println(builder2.replace(4,5, " равно "));

}
}
