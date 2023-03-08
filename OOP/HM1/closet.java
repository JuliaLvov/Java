package OOP.HM1;



public class closet {

    private String name;
    private State state; 
    private int books;

     enum State{
        Open, Close;
    }

    public closet(String name){
        // String.format("Шкаф: %s", this.name);
        this.name = name;
        this.state = State.Close;
    }


    public String getName(){  
        return name;
    }
    
    public void setName(String name) { 
        this.name = name;               
    }

    @Override
    public String toString(){
        return this.name;
    }


    public String getAction(){
       if (this.state == State.Open){this.state = State.Close;}
       else this.state = State.Open;
        return String.format("%s: %s", this.name, state.toString());
    }
    
    public void AcceptBooks(int book){
        this.books =+ book;
    
   }

   public String getInfo(){
    return String.format("Name: %s Books: %d" , this.name, this.books);
}


   
}
