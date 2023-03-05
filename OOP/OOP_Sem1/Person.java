package OOP.OOP_Sem1;
import java.util.ArrayList;

public class Person {
    private String name;
    ArrayList<Person> family = new ArrayList<>();

    public Person(String name) {
        return name;
    }

    public String getName( String name){
        this.name = name;
    }

    public void appendToFamily(Person person){
        if(person !=this ){
            family.add(person);
        }
    }

    

}
