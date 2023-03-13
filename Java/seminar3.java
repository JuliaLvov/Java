package Java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class seminar3 {

    public static void main(String[] args) {
        
        int a = 5;
        String s = "";
        int[] ar = new int[5]; //ссылочный тип
        
        //базовая коллекци List

        List<String> list = new ArrayList<>(); // по умолчанию 10 элементов создает, разные типа могут быть одном листе, не можем хранить примитивные типы , только ссылки
        list.add("1");
        list.add("true"); //<>обобщает типа, если стриннг, то 1 и тру он подчеркнет
        list.add("Привет!");
        list.add(1, "One");
        list.add("2");
        list.add("3");
        list.add("4");
        // list.set(1, "Two"); // отличает от add тем что изменяет значение

        String s1 = list.get(1); // получить значение

        // list.remove(1); // либо удаляем по индексу и тогда нужно добавить число
        // list.remove("Two"); //  либо тот же remove но удаляем мы уже сам объект
        // System.out.println(list.remove("Two"));
        // System.out.println(list.remove("Two"));

        String[] j = new String[list.size()];
        list.toArray(j);  // нужно следить за ссылками

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("true"); 
        list1.add("Привет!");
        list1.add(1, "One");
        // list1.add("2");
        // list1.add("3");
        // list1.add("4");
        // list1.set(1, "Two");

        //list.sublist(1,12); вернет из списка подсписок  в диапозоне от 1 до 12

        // list.forEach(n -> System.out.println(n));  //если нужно пробежаться по списку и все значения напечатать, но невозможно удалить или изменить элемент из-за доп переменной n
        // System.out.println(list1);

    //     for (String str: list) { // другой способ написания foreach
    //         str ="r";
    //    }
    //    System.out.println(list);

       Iterator<String> iterator = list.iterator(); // еще один метод перебора, но не через for, а через while. Одноразовый каждый раз надо инициализировать 
       while (iterator.hasNext()){                  // Метод hasNext возвращает истину пока не перебрали все эл. списка
             String str = iterator.next();          //чтобы из списка вытащить следующий элемент метод next
            if(str.equals("1")){            //если не ставить условие, то удалить все элементы
                iterator.remove();  
            } 
        }                    
        // } System.out.println(list);
            
       
       // size > 10 -> size = size*2+1
       for (int i = 0; i < list.size();i++){   //аналог итератора с бОльшим функционалом
        // System.out.println(list.get(i));       // можно использовать разные методы помимо get
       }

    //    System.out.println(list);
    //    System.out.println(list1);
    //    System.out.println("-".repeat(16));
    //    list.retainAll(list1);  // метод, который принимает в себя другой список,  если есть 2 списка и нужно оставить только совпадающие элементы
    //    list.removeAll(list1);    //из списка удаляет совпадающие и оставляет только новые элементы
    //    System.out.println(list);
    // list.isEmpty();
    // boolean b = list.size()==0;

        //  LinkedList<String> list2 = new LinkedList<>(); // работает более медленее arraylist (next, prv, vol, hash-внутр идентификатор объейктов в java) и нет индекса у элементов
         //редко используется

         Collections.sort(list2); // сортировка по алфавиту, цифры по увеличению
         list.forEach(n->list3.add(0, n)); // разворот одной строчкой

    }
    
}
