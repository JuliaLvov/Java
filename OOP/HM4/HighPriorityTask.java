package OOP.HM4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HighPriorityTask extends Task implements Deadline{


//         public HighPriorityTask(String author){
//         super(author); 
//    }

   public HighPriorityTask(String author,  Integer h){
    super(author);
        this.DeadlineDate = LocalDate.now();            // предполагается, что срочная задача должна выполняться в тот же день
        this.DeadlineTime = LocalTime.of(h, 00);
        this.priority = 1;
}

public String getDeadlineDate(){
    return this.DeadlineDate.toString();
}

public String getDeadlineTime(){
    return this.DeadlineTime.format(DateTimeFormatter.ofPattern("hh:mm"));
}

public Integer getPriority(){
    return this.priority;
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
        return String.format("%s\tВысокий приоритет\tдата и время выполнения: %s %s", super.toString(), DeadlineDate, getDeadlineTime(), priority);
        // return String.format("%s:\tВысокий приоритет\tСделать срочно", super.toString());
    }
}
