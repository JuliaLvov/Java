package OOP.OOP_Sem1;

public class Main{

    public static void main(String[] args) {
        

        // OOP1 oop1 = new OOP1("млекопитающие");
        
        // System.out.println(oop1.getModel());


        person first = new person( "Вася");
        person second = new person( "Миша");
        person third = new person( "Маша");
        person forth = new person( "Человек для Маши");

        first.appendToFamily(second);
        first.appendToFamily(third);
        third.appendToFamily(forth);

        System.out.println(first.getFamily());
    }

    public static void view(Person rootPerson){
        System.out.println(rootPerson);
        for (Person person : rootPerson.getFamily()) {
            view(person);
        }
    }
}


