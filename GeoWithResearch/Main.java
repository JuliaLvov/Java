package GeoWithResearch;

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
        System.out.println(vasya.getGender());
        System.out.println(irina.getGender());

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        
        System.out.println(new Reserch(gt).oldierPerson(25)); //выводит список людей старше указанного возраста

        

        // System.out.println(masha.viewGender("Male"));
    }
}
