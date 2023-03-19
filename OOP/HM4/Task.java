package OOP.HM4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Task implements Comparable<Task>{
    protected int id;
    protected String author;
    protected static Integer count = 0;
    private LocalTime addTime;
    private LocalDate addDate;
    protected Integer priority;
    protected LocalDate DeadlineDate;
    protected LocalTime DeadlineTime;


    public Task(String author){
        this.id = count++;
        this.author = author;
        this.addTime = LocalTime.now().plusHours(id);
        
        this.addDate = LocalDate.now().plusDays(id);
    } 

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }

    public String addTime(){
        return this.addTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String addDate(){
        return this.addDate.toString();
    }

    public LocalDate getDD(){
        return this.DeadlineDate;
    }

    public LocalTime getDT(){
        return this.DeadlineTime;
    }

    @Override
    public int compareTo(Task o){
        if (this.DeadlineDate == o.getDD()){
            return this.DeadlineTime.compareTo(o.getDT());
        }
        else return this.DeadlineDate.compareTo(o.getDD());
    }



    @Override
    public String toString() {
        return String.format("id-%d:\tавтор: %s\tдата и время создания:  %s %s", id, author, addDate, addTime(), priority);
    }

    
}   
