package Java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lecture3 {
    public static void main(String[] args) {
    //     Object o = 1; GetType(o); //java.lang.Integer
    //     o = 1.2; GetType(o);      //java.lang.Double
    // }
    // static void GetType(Object obj) {
    //     System.out.println(obj.getClass().getName());

    //     System.out.println(Sum(1, 2));
    //     System.out.println(Sum(1.0, 2));
    //     System.out.println(Sum(1, 2.0));
    //     System.out.println(Sum(1.2, 2.1));
    // }
    // static Object Sum (Object a , Object b) {
    //     if ( a instanceof Double && b instanceof Double){
    //         return (Object) ((Double) a + (Double) b);
    //     } else if (a instanceof Integer && b instanceof Integer){
    //         return (Object)((Integer) a + (Integer) b);
    //     } else return 0;
    // }
    
    // int[]a = new int[]{1,9};
    // int[]b= new int[3];
    // System.arraycopy(a, 0, b, 0, a.length);

    // for (int i : a) {System.out.printf("%d", i);} // 1 9
    // for (int j : b) {System.out.printf("%d", j);} // 0 9 0 0 0 0 0 0 0 0
    
    // static int[] AddItem(int[] array, int item) {
    //     int length = array.length;
    //     int[] temp = new int [length + 1];
    //     System.arraycopy(array, 0, temp, 0, length);
    //     temp[length] = item;
    //     return temp;
    // }
    // public static void main(String[] args) {
        
    //     int[]a = new int[] {0, 9};
    //     for (int i : a) {System.out.printf("%d", i); }
    //     a = AddItem (a, 2);
    //     a = AddItem(a, 3);
    //     for (int j : a ) {System.out.printf("%d", j);}


       

//    // способы записи
//    ArrayList<Integer> list1 = new ArrayList<Integer>();
//    ArrayList<Integer> list2 = new ArrayList<>();
//    ArrayList<Integer> list3 = new ArrayList<>(10);
//    ArrayList<Integer> list4 = new ArrayList<>(list3);

//    //есть разный функционал
//    add(args) - добавляет элемент в список ( в т.ч. на нужную позицию)
//    get(pos) - возвращает элемент из списка по указанной позиции
//    indexOf(item) - первое вхождение или -1
//    lastIndexOf(item) - последнее вхождение или -1
//    remove(pos) - удаление элемента на указанной позиции и его возвращение
//    set(int pos, T item) - помещает значение item элементу, который находится на позиции pos
//    void sort(Comparator) - сортирует набор данных по правилу
//    subList(int start, int end) - получение набора данных от позиции start до end



    List<Integer> list = List.of(1, 12, 123, 1234, 12345);
    
    for (int item : list) {
        System.out.println(item);
    }

    Iterator<Integer> col = list.iterator();
    System.out.println();

    while (col.hasNext()) {
        System.out.println(col.next());
        col.next();
        col.remove();

    }

}

}
 