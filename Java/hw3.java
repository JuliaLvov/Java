package Java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hw3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("White");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");
        list.add("Orange");
        list.add("Green");
        System.out.println(list);  //Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран

         

        for (int i = 0; i < list.size(); i++) {           //Итерация всех элементов списка цветов и добавления к каждому символа '!'
            StringBuilder newlist = new StringBuilder();
            newlist.append(list.get(i).toString()).append('!');
            list.remove(i);
            list.add(i, newlist.toString());
        }
        System.out.println(list);


      list.add(0, "red");  //Вставить элемент в список в первой позиции.
      System.out.println(list);

      System.out.println(list.get(2)); //Извлечь элемент (по указанному индексу) из заданного списка


        list.set(2, "Yellow"); // Обновить определенный элемент списка по заданному индексу.
        System.out.println(list);
    

    list.remove(2);
    System.out.println(list);      // Удалить третий элемент из списка.

    Iterator<String> iterator = list.iterator();   // Поиска элемента в списке по строке
        while (iterator.hasNext()){  
            String element = iterator.next();   
            if(element.contains("Black")){ 
                System.out.println("true");
            }
            else {
             System.out.println("false");

        }
    } 


    ArrayList<String> list2 = new ArrayList<>(); // Создать новый список и добавить в него несколько елементов первого списка.
    list2.add("White");
    list2.add("Blue");
    list2.add("Pink");
    list2.add("12");
    list2.add("10");
    list2.add("4");

    System.out.println(list);
    System.out.println(list2);
    list.retainAll(list2); 
    System.out.println(list);

    
}

}
