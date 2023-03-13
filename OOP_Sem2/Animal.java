package OOP_Sem2;



public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
}
// из абстрактоног можно наследовать, абстрактные методы не имеют функционал
//  интерфейсуказывает на то, что эти объекты умеют что-то делать
// extends  в рамках интерфейс не наследуют, а расширяют
// implements interface
// по древу, сделать printable интерфейс, в исследование или геотри