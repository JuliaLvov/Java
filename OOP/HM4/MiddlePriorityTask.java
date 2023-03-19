package OOP.HM4;

import java.time.LocalDate;
import java.time.LocalTime;

public class MiddlePriorityTask extends Task implements Deadline {


    public MiddlePriorityTask(String author, Integer y, Integer m, Integer d, Integer h){
        super(author);
        this.DeadlineDate = LocalDate.of(y, m, d);
        this.DeadlineTime = LocalTime.of(h, 00);
        this.priority = 2;
    }

    public String getDeadlineDate(){
        return this.DeadlineDate.toString();
    }

    public String getDeadlineTime(){
        return this.DeadlineTime.toString();
    }


    // @Override
    // public int compareTo(Task o){
    //     if (this.priority == o.priority){
    //         return 0;
    //     }
    //     else if(this.priority < o.priority){
    //         return -1;
    //     }
    //     else return 1;
    // }

    @Override
    public String toString() {
        return String.format("%s\tСредний приоритет\tдата и время выполнения: %s %s", super.toString(), DeadlineDate, DeadlineTime);
    }
}
