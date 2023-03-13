package OOP.HM2;

public class Person extends Animal implements InterCall, InterCaress{

    public Person(String name){
        super(name); 

    }

    // public String getName(){  // на получение
    //     return name;
    // }
    
    // public void setName(String name) { // задать какое-то значение
    //     this.name = name;               
    // }

    @Override
    public String toString(){
        return this.name;
    }


    // public String voice(Animal animal){
    //     return String.format("%s мяукает к %s -> ", this.name, animal.getName());
    //     if (animal instanceof InterCall) {
    //         ((InterCall) animal).voice(this);}
    // }


 
    public String voice(){ // тут также
        return this.name + " зовет кошку";
    }


   
    public void call(Animal animal){ // все совпадать должно

         System.out.print(voice() + ": ");
         System.out.println(((InterCall)animal).voice());

        
    }

    

    public String getInfo(){
        return String.format("Name: %s Pleasure: %d" , this.name, this.pleasure);
    }

    public int caress(int touch){
        this.pleasure =+ touch;
        return touch; 
        
        
    }

}
