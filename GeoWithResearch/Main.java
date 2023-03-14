package GeoWithResearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Person irina = new Person("Ирина", 40, "ж");
        Person vasya = new Person("Вася", 15, "м");
        Person masha = new Person("Маша", 35, "ж");
        Person jane = new Person("Женя", 12, "ж");
        Person ivan = new Person("Ваня", 10, "м");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        System.out.println(vasya.getGender()); // выводит пол человека
        System.out.println(irina.getGender()); // выводит пол человека
        System.out.println(masha.getGender()); // выводит пол человека

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));                    // вывод родственных связей
        
        System.out.println(new Reserch(gt).oldierPerson(25)); //выводит список людей старше указанного возраста
        System.out.println(new Reserch(gt).youngerPerson(25)); // выводит список людей младше указанного возраста

        System.out.println("----------");

        gt.print();
        ivan.print(); // вывод информации о человеке


        System.out.println("----------");

         List<Person> family = new ArrayList<Person>();
         family.add(irina);
         family.add(vasya);
         family.add(masha);
         family.add(jane);
         family.add(ivan);
         System.out.println("Список членов семьи до сортировки" + family);
         Collections.sort(family);
         System.out.println("Список членов семьи после сортировки" + family);



        
        






        // System.out.println(masha.viewGender("Male"));
    }
}
