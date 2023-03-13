package Java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//ввести с консоли инфо о неких людях ФИО возраст пол, прога выводит всех подряд и варианта 2 либо завершение приложение, либо кнопка вывод списка отсортированного по возрасту
// 1. Ввод с консоли в формате Ф.И.О Возраст пол
// 2. Выход из режима ввода по горячей кнопке
// 3. Вывод несортированного списка в формате Иванов И.И.
// 4. Два варианта продолжения, либо вывод списка сортированного по возрасту либо завершение приложения.

public class seminar4 {
    
    public static void main(String[] args) {
        
        public static void bubleSortAge(ArrayList<Integer> age, LinkedList<Integer> index ){
            ArrayList<Integer> = new ArrayList<>(age);
            
            boolean sort = true;

            int k = ageTmp.size();
            while (sort){
                sort = false;
           
            for (int i = 0; i< k-1; i++){
                if (ageTmp.get(i) > ageTmp.get(i+1) ) {
                    int temp = ageTmp.get(i);
                    ageTmp.set(i,  ageTmp.get(i+1));
                    ageTmp.set(i+1, temp);

                    int temp2 = index.get(i);
                    index.set(i, index.get(i + 1));
                    index.set(i + 1, temp2);
                   

                    sort = true;
                }
            }
            k--;
        }
 }

public static void sortGender(ArrayList<Boolean>gender, LinkedList<Integer> index){

    LinkedList<Integer> indexTemp = new LinkedList<>();
    
   

    for (int i = 0; i < gender.size()-1; i++) {

        
            if (gender.get(i)){
            int temp = index.get(i);
            index.remove(i);
            index.add(temp);
            i--;
            
        }
    }
}

}

        LinkedList<Integer> index = new LinkedList <>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ФИО, Возраст, пол, через пробел. Выход через ! ");

        boolean run = true;
        while(run){
            String in = scanner.nextLine();
            if (in.equals("!") ){
                run = false;
            }
            else {
                String [] data = in.split(" ");
                index.add(lastName.seze);
                lastName.add(data[0]);
                firstName.add(data[1]);
                patronymic.add(data[2]);
                age.add(Integer.parseInt(data[3]));
                gender.add(data[4]);

                gender.add(data[4])
            }
        }



        for(int i = 0; i<= lastName.size(); i++){
            StringBuilder str = new StringBuilder();
            str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).charAt(0)).append(". ");
            System.out.println(str);
        }

        bubleSortAge(age, index);

        for (int i:index) {
            StringBuilder str = new StringBuilder();
            str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).charAt(0)).append(". ").append(gender.get(i)).;
            System.out.println(str);
        }
        sortGender(gender, index);
            
    }
}
