package Java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        // LinkedList<Integer> index = new LinkedList <>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("ФИО, Возраст, пол, через пробел. Выход через x ");

        boolean run = true;
        while(run){
            String in = scanner.nextLine();
            if (in.equals("x") ){
                run = false;
            }
            else {
                String [] data = in.split(" ");
                // index.add(lastName.size());
                lastName.add(data[0]);
                firstName.add(data[1]);
                patronymic.add(data[2]);
                age.add(Integer.parseInt(data[3]));
                gender.add(data[4]);
            }
        }

       for (int i = 0; i <lastName.size(); i++) {
        StringBuilder str = new StringBuilder();
        str.append(lastName.get(i)).append(" ").append(firstName.get(i).charAt(0)).append(". ").append(patronymic.get(i).charAt(0)).append(". ");
        System.out.println(str);
       }


       
      
    }

}
