package OOP.HM4;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> list = new ArrayList<>();

    
    public void add(Task task){
        list.add(task);
    }

    public void addHightask(String author,Integer h){
        HighPriorityTask task = new HighPriorityTask(author, h);
        list.add(task);
    }

    public void addMiddletask(String name, Integer y, Integer m, Integer d, Integer h){
        MiddlePriorityTask task = new MiddlePriorityTask(name, y, m, d, h);
        list.add(task);
    }

    public void addLowTask(String name, Integer y, Integer m, Integer d, Integer h){
        LowPriorityTask task = new LowPriorityTask(name, y, m, d, h);
        list.add(task);
    }

    public ArrayList<Task> getList(){
        return this.list;
    }

    public void print(){
        for (Task i: list){
            System.out.println(i);
        }
    }
}

