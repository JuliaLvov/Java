package OOP.HM2;

public abstract class Animal {
    protected String name;
    protected int pleasure;

Animal(String name){
    setName(name);
    this.pleasure = 0;
}  

public String getName(){ 
    return name;
}

public void setName(String name) {
    this.name = name;               
}

public String getInfo(){
    return String.format("Имя: %s ", this.name);
}
    
}
