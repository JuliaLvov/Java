package OOP.HM2;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Буся");
        Person person = new Person("Хозяйка");


        // System.out.println(cat);
        // System.out.println(person);
        // System.out.println(person.voice());
        // System.out.println(cat.voice());

        cat.call(person);
        person.call(cat);
        System.out.println(person.getInfo());
        System.out.println(cat.getInfo());
        cat.getCaress(person.caress(3));
    
        System.out.println(person.getInfo());
        System.out.println(cat.getInfo());



    }
}
