package OOP.OOP_Sem3;



public class Animal implements Comparable<Animal>{   // естественная сравнение  в классе может быть одно ,
    public String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        
        return this.name.toString();
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public int compareTo(Animal o) {
        return this.getAge()- o.getAge();
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }else if (this.getClass()!=obj.getClass()){
            return false;
        
        }else return this.getName().equals(((Animal)obj).getName());

        }

        // для дз переопределить equals
    }

