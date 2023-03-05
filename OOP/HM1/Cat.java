package OOP.HM1;

public class Cat {
    private String kisa;
    private int pleasure;


    public Cat(String kisa){ // конструктор, макет, шаблон по которому будет строится наш класс
        this.kisa = kisa; 
        this.pleasure = 0;      // присвоение даннному классу, данной переменной
    }


    public String getKisa(){  // на получение
        return kisa;
    }
    
    public void setKisa(String kisa) { // задать какое-то значение
        this.kisa = kisa;               
    }

    

    @Override
    public String toString(){
        return this.kisa;
    }

    public String voice(){
        return this.kisa + " мяукает";
    }

    public String getInfo(){
        return String.format("Kisa: %s  Pleasure: %d", this.kisa, this.pleasure);
    }

    public void getCaress(int touch){
         this.pleasure =+ touch;
     
    }
        
    
        
        
    }


