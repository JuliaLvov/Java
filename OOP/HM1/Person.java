package OOP.HM1;

public class Person {
  
    private String name;
    private int pleasure;

    public Person(String name){
        this.name = name;
        this.pleasure = 0;
    }

    public String getName(){  // на получение
        return name;
    }
    
    public void setName(String name) { // задать какое-то значение
        this.name = name;               
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String voice(){
        return this.name + " зовет кошку";
    }

   
    public void call(Cat cat){
         System.out.println(voice());
         System.out.println(cat.voice());
        
    }

    public String getInfo(){
        return String.format("Name: %s Pleasure: %d" , this.name, this.pleasure);
    }

    public int caress(int touch){
        this.pleasure =+ touch;
        return touch;
        
    }

}
