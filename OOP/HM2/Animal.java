package OOP.HM2;

public abstract class Animal {
    protected String name;
    protected int pleasure;
    protected String colour;

Animal(String name, String colour){
    setName(name);
    setColour(colour);
    this.pleasure = 0;
}  

public String getName(){ 
    return name;
}

public void setName(String name) {
    this.name = name;               
}

public String getColour(){ 
    return colour;
}

public void setColour(String colour) {
    this.colour = colour;               
}

public String getInfo(){
    return String.format("Имя: %s ", this.name);
}
    
}
