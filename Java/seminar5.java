package Java;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class seminar5 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hashMap = new HashMap<>(); // <ключ, значение> 

        hashMap.put(0,"Y");
        hashMap.putIfAbsent(1, "Y");
        hashMap.remove(1); // удаляет по ключу
        hashMap.put(1,"A"); // put поменяет значение сам, ключ это и есть индекс
        hashMap.put(2,"H");
        hashMap.put(3,"G");
        hashMap.put(4,"P");



        //System.out.println(hashMap.get(0));

        //перебор мапов - большие проблемы,нет индексов

        // hashMap.forEach(k, v -> System.out.println(k + " "+v));

        // for (String s: hashMap.values()) { //перебор по значению, получаем только значение
        //     System.out.println(s);
        // }

        // for (Integer s: hashMap.keySet()) { //перебор по ключу, получаем только ключи
        //     System.out.println(s);
        // }

        // for (Integer s: hashMap.keySet()) { //показывает все значения по ключу, удалять данные внутри foreach нельзя, все сломается
        //     System.out.println(hashMap.get(s));
        // }

        // for (Map.Entry<Integer, String> item: hashMap.entrySet()) { //перебор по внутряшке
        //     System.out.printf("[%d, %s]" item.getKey(), item.getValue());
        // }

        // for(int i = ; i <hashMap.keySet().size(); i++) { // аналог вн цикла, но здесь выбираем ключ 
        //     System.out.println(hashMap.get(hashMap.keySet().toArray()[i]));
        // }

         hashMap.containsValue("Y"); //если значение есть вернет истини, если нет ложь
         hashMap.compute(1,(k,v) -> v += "!"); //лямбда это выржание которое явл функцией, compute может менять выражаение, ключ, кот мы выбрали - эл с кот мы будем работать, лямбда это то что мы будем делать с выражением
         hashMap.computeIfAbsent(5, v->"F!"); // положит значение туда, это лямбда, можем положить туда функцию 
         //hash.Map.computeIfPresent(5, (k,v) -> += "!"); // к старому значению добавляем !
         

         // compute отличается от put тем что это лямбда (-> этот значок и есть лямбда)

         hashMap.merge(4, "?", String::concat); //  :: (двойное : - скоращенный вывод инфы)когда мы вызываем метод из библиотеки
        //hashMap.forEach((k,v) -> System.out.println(k+ " "+ v));

        //putAll положить данные из одного hashMap  в другой

        LinkedHashMap<String, String> LinkedHashMap = new LinkedHashMap<>();// обертка вокруг hashMap, отличает hashMap не гарантирует сортировку и порядок вывода
                                                                            // ключ может быть любым экземпляром любого класса, сохраняется порядок ввода

            TreeMap<String, String> treeMap = new TreeMap<>(); //работает как и все остальное, но внтури сеть дерево
            treeMap.put("1", "546");
            treeMap.put("2", "56");
            treeMap.put("3", "авыпр");
            treeMap.put("4", "5ап46");
            treeMap.put("5", "5артт46");
           // System.out.println(treeMap);
            treeMap.tailMap("3", true);


            // создать хэшмэп, у которого ключ это строка, значение любое, заполнить 6 -7 строчек и вывести 2-мя разными методами перебора

            HashMap<String, Integer> hashMap2 = new HashMap<>(); 
            hashMap2.put("first",2);
            hashMap2.put("second",5);
            hashMap2.put("third",3);
            hashMap2.put("fourth",7);
            hashMap2.put("fifth",6);
            hashMap2.put("six",8);

            hashMap2.forEach((k,v) -> System.out.println(k + " " + v));
            System.out.println(hashMap2);

            hashMap2.compute("first",(k,v) -> Integer.toBinaryString(v).length());
            System.out.println(hashMap2.compute("first",(k,v) -> Integer.toBinaryString(v).length()));
            System.out.println(hashMap2);

            for (String item: hashMap2.keySet()) { 
                hashMap2.compute("first",(k,v) -> Integer.toBinaryString(v).length());
            }
            System.out.println(hashMap2);

            HashMap<String, Integer> hashMap3 = new HashMap<>(); 
            hashMap3.put("first",15);
            hashMap3.put("second",28);
            hashMap3.put("third",666);
            hashMap3.put("fourth",777);
            hashMap3.put("fifth",615);
            hashMap3.put("six",81565);

            //qqq.merge("один", 1, (nV, tV) -> tV + qq.get("один"));

            for (String item: hashMap2.keySet()){
            hashMap2.merge(item, hashMap3.getOrDefault(item, 0), (nV, tV)-> nV + tV);
            }
            System.out.println(hashMap2);



            

            


    






    }
}
