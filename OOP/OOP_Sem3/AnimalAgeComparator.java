package OOP.OOP_Sem3;


import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
        // return o1.getName().compareTo(o2.getName());
    }
    
}
//   компаратор использвуются для частностей и больше используется для списков