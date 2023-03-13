package Java;
import java.util.ArrayList;
import java.util.HashMap;

public class hw6 {
    public static void main(String[] args) {
        MySet set = new MySet();

        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println(set.getArrayList());
        System.out.println(set.subSet(7,9));

    }
}

class MySet{

    HashMap<Integer,Object> values = new HashMap<>();

    private static final Object X = new Object();
    

    void add (int data){
        values.put(data, X);
    }

    ArrayList getArrayList(){

        ArrayList <Integer> res = new ArrayList<>();
        values.forEach((k,v) -> res.add(k));
        return res;
    }

    MySet subSet (int key1, int key2){
            MySet res = new MySet();
            int ad = 0;
            for (int el: values.keySet()) {
                if ((el == key1 || el == key2) && ad == 0){
                    ad = 1;
                    res.add(el);
                    continue;
                }
                if ((el == key1 || el == key2) && ad == 1){
                    res.add(el);
                    break;}
                else if (ad == 1) res.add(el);
            }
            return res;
        } 

}
