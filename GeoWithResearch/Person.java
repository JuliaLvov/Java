package GeoWithResearch;

import java.util.ArrayList;

public class Person implements Printable{
    public String fullName;
    public Gender gender; 
    public int age;
    static ArrayList<Person> family = new ArrayList<Person>();

    public Person(String fullName, int age, String gen) {
        this.fullName = fullName;
        this.age = age;
        if (gen == "м") this.gender = Gender.Male;
        if (gen == "ж") this.gender = Gender.Female;
        family.add(this);
    }


    public String getFullName() {
        return fullName;
    }

    public String setFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    enum Gender{
        Male, Female
    }

    public String getGender() {   
            return this.gender.toString();
     }

    

    //  public ArrayList<String> viewGender(String gender){
    //     ArrayList<String> result = new ArrayList<String>();
    //     for (Person t : family){
    //         if(t.getGender() == gender) result.add(t.fullName + " " + t.getGender());
    //     }
    //     return result;
    // }
    
     // public String toString(){
    //     return this.fullName;
    // }


}
