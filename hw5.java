import java.util.HashMap;

public class hw5 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashMap = new HashMap<>(); 
            hashMap.put("first",2);
            hashMap.put("second",5);
            hashMap.put("third",3);
            hashMap.put("fourth",7);
            hashMap.put("fifth",6);
            hashMap.put("six",8);

            hashMap.forEach((k,v) -> System.out.println(k + " " + v));
            System.out.println(hashMap);

            hashMap.compute("first",(k,v) -> Integer.toBinaryString(v).length());
            System.out.println(hashMap.compute("first",(k,v) -> Integer.toBinaryString(v).length()));
            System.out.println(hashMap);

            for (String item: hashMap.keySet()) { 
                hashMap.compute("first",(k,v) -> Integer.toBinaryString(v).length());
            }
            System.out.println(hashMap);

            HashMap<String, Integer> hashMap2 = new HashMap<>(); 
            hashMap2.put("first",15);
            hashMap2.put("second",28);
            hashMap2.put("third",666);
            hashMap2.put("fourth",777);
            hashMap2.put("fifth",615);
            hashMap2.put("six",81565);



            for (String item: hashMap.keySet()){
            hashMap.merge(item, hashMap2.getOrDefault(item, 0), (nV, tV)-> nV + tV);
            }
            System.out.println(hashMap);


    }
}
