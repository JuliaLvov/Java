package OOP.HM4;

import java.util.Comparator;

public class PriorityComparator implements Comparator<Task>{

    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
    
    
    
    // public int compareTo(Task o){
    //     if (this.priority == o.getPriority()){
    //         return 0;
    //     }
    //     else if(this.priority < o.getPriority()){
    //         return 1;
    //     }
    //     else return -1;
    // }
}




    // public int compareTo(Object o){
    //     if ((this.priority == (((Task) o).getPriority()))) return this.compareTo(o);
    //     if (this.priority == 3) return -1;
    //     else if (((Task) o).getPriority() == 3) return 1;
    //     else if (this.deadLineDateTime.compareTo(((Task)o).getDead()) == 0) return this.priority.compareTo(((Task) o).getPriority());
    //     else return (this.deadLineDateTime.compareTo(((Task)o).getDead()));
    // }





