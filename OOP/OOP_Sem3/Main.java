package OOP.OOP_Sem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Animal animalFirst = new Animal("Животное_2", 2);
        Animal animalSecond = new Animal ("Животное_4", 1);
        Animal animalThird = new Animal("Животное_3", 1);
        Animal animalFourth = new Animal ("Животное_1", 7);

        // ArrayList<Animal> list = new ArrayList<>();

      

        // list.add(animalFirst);
        // list.add(animalSecond);
        // list.add(animalThird);
        // list.add(animalFourth);
        
        // Iterator<Animal> iterator = list.iterator(); // умеет только перебирать объекты класса animal
        // while(iterator.hasNext())
        // System.out.println(iterator.next()); 
        // if(iterator.next().getName().equals("Животное_1"));
        // iterator.remove();{  // удаляет текущий элемент
        // }
        // System.out.println(list);
        // } 

        ArrayList<Animal> list = new ArrayList<>();
        list.add(animalFirst);
        list.add(animalSecond);
        list.add(animalThird);
        list.add(animalFourth);

        System.out.println(list);


        Collections.sort(list, new AnimalAgeComparator());

        System.out.println(list);


        // ListIterator<Animal> listIterator = list.listIterator(); // перебор коллекций

    //  можно сравнивать через ==, чередз obj.equals(Object object)

        




        // ArrayList<Animal> newList = new ArrayList<>();

        // for (Animal animal : list) {
        //     if(animal.getName()!="Животное_1"){
        //         // list.remove(animalFirst);
        //         newList.add(animal);
        //     }
        // }

        // for (int i = 0; i<list.size(); i++) {
        //     // if(list.get(i).getName()=="Животное_1"){
        //         newList.add(list.get(i));
        //     }
        }
    }


