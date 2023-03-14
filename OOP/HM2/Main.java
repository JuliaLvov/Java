package OOP.HM2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat catFirst = new Cat("Буся", "Белый");
        Cat catSecond = new Cat("Муся", "Черный");
        Cat catThird = new Cat("Лапуся", "Трехцветный");
        Cat catFourth = new Cat("Мистер Кот", "Рыжий");
        Cat catFifth = new Cat("Кот Борис", "Лысый");

        Person person = new Person("Хозяйка");

    


        // System.out.println(cat);
        // System.out.println(person);
        // System.out.println(person.voice());
        // System.out.println(cat.voice());

        // cat.call(person);
        // person.call(cat);
        // System.out.println(person.getInfo());
        // System.out.println(cat.getInfo());
        // cat.getCaress(person.caress(3));
    
        // System.out.println(person.getInfo());
        // System.out.println(cat.getInfo());

        List<Cat> list = new ArrayList<Cat>();
        list.add(catFirst);
        list.add(catSecond);
        list.add(catThird);
        list.add(catFourth);
        list.add(catFifth);

        System.out.println("Список кошек до сортировки" + list);
        Collections.sort(list);
        System.out.println("Список кошек после сортировки" + list);



    }
}
