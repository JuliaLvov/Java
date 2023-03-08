package OOP.HM1;

public class person2 {
    private String name;
    private int books;


    public person2(String name) {
        this.name = name;
        this.books = 0;
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

    public void action(String state){
        System.out.println(state);
    };

    public String getInfo(){
     return String.format("Name: %s " , this.name + " Сейчас как положу 3 книги в шкаф. Пусть все обалдеют!");
    }

    public int PutBooks(int book){
        this.books =- books;
        return book;
        
    }

    // {
    //     if (this.state = State.Close){
    //         this.ActionOpen();
    //         this.state = State.Open;
    //     } else {
    //         this.ActionClose();
    //         this.state = State.Close;
    //     }
    //    }

}
