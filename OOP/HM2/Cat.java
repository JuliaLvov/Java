package OOP.HM2;

public class Cat extends Animal implements InterCall, InterGetCaress {

    public Cat(String name){ 
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

    public String voice(){
        return this.name + " мяукает";
    }

    public void call(Animal animal){
        System.out.printf("%s мяукает в адрес Хозяйки: ", this.name);
        System.out.println(((InterCall) animal).voice());
    }

    public String getInfo(){
        return String.format("Кличка: %s  Pleasure: %d", this.name, this.pleasure);
    }

    public void getCaress(int touch){
         this.pleasure =+ touch;
     
    }
        
    
        
        
    }


