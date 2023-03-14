package GeoWithResearch;

import java.util.ArrayList;

public class Person implements Printable, Comparable<Person>{
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

     public String toString(){
        return String.format("%s: %d %s", getFullName(), getAge(), getGender());
    }

    public void print(){
        System.out.println(this.toString());
        System.out.println();
    }
    
    @Override
    public int compareTo(Person anotherPerson){
        if (this.age == anotherPerson.age){
            return 0;
        }
        else if (this.age < anotherPerson.age){
            return -1;
        }
        else{
            return 1;
        }
    }



}
