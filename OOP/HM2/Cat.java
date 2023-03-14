package OOP.HM2;

public class Cat extends Animal implements InterCall, InterGetCaress, Comparable<Cat> {

    public Cat(String name, String colour){ 
        super(name, colour);
              
    }

    

    @Override
       public String toString(){
        return String.format("%s:%s", this.name, this.colour);
    }

    public String voice(){
        return this.name + " мяукает";
    }

    public void call(Animal animal){
        System.out.printf("%s мяукает в адрес Хозяйки: ", this.name);
        System.out.println(((InterCall) animal).voice());
    }

    public String getInfo(){
        return String.format("Кличка: %s  Pleasure: %d", this.name, this.pleasure, this);
    }

    public void getCaress(int touch){
         this.pleasure =+ touch;
     
    }

    @Override
    public int compareTo(Cat anotherCat){
        return this.colour.compareTo(anotherCat.colour);
    }
        
    
        
        
    }


