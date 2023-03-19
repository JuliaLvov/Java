package OOP.HM4;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
      

        TaskList list = new TaskList();
        
       list.addHightask("Юлия", 21);
       list.addLowTask("Юлия", 2023, 04, 20, 15); 
       list.addLowTask("Юлия", 2024, 9, 10, 15); 
       list.addLowTask("Юлия", 2026, 02, 28, 16); 
       list.addLowTask("Юлия", 2024, 8, 1, 13); 
       list.addMiddletask("Юлия", 2024, 10, 25, 16);
       list.addMiddletask("Юлия", 2024, 8, 16, 9);
       list.addMiddletask("Юлия", 2024, 9, 3, 10);
       list.addMiddletask("Юлия", 2024, 1, 17, 10);
   
       list.print(); //вывод неотсрортированного списка задач
       
       Collections.sort(list.getList()); // // естественная сортировка по дате дедлайна
       System.out.println("-------");
       list.print();  // вывод естественной сортировки
       System.out.println("-------");
       Collections.sort(list.getList(), new PriorityComparator()); // сортировка по приоритету
       list.print(); // вывод сортировки по приоритету

            
        
    }
}
