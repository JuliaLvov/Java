package Java;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class lecture5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>(); // ключевой интерфейс map <тип ключа, тип значения> наименование = new
        db.putIfAbsent(1, "один");
        db.put(2, "два");               // метод put позволяет что-то добавлять (добавление по тому же ключу перезаписывает значение)
        db.put(null, "!null");             
        //System.out.println(db); //{null = !null, 1 = один, 2 = два}
        //System.out.println(db.get(44));
        //db.remove(null);
        //System.out.println(db); //{1= один, 2= два}
        //System.out.println(db.containsValue("один")); //true     функционал проверки значения
        // System.out.println(db.containsValue(1)); //false
        // System.out.println(db.containsValue("один")); //false
        //System.out.println(db.containsKey(1)); //true          функционал проверки ключа
        //System.out.println(db.keySet());            // коллекция всех ключей
           // System.out.println(db.values());        // коллекция всех значений

            // основной функионал HashMap
            
            // put(K,V) - добавить пару если или изменить значение, если ключ имеется
            // putIfAbsent(K,V) - произвести добавление если ключ не найден
            // get(K) - получение значения по указанному ключу
            // remove(K) - удаляет пару по указанному ключу
            // containsValue(V) - проверка наличия значения
            // containsKey(K) - проверка наличия ключа
            // keySet() - возращает множество ключей
            // values() - возвращает набор значений

            // Как ускорить работу

            // Map<Integer, String> map1 = new HashMap<>(); //  конструктор HashMap без аргументов, выделяем какое-то значение массива по умолчанию
            // Map<Integer, String> map2 = new HashMap<>(9); // указывает конретно значение, например 9
            // Map<Integer, String> map3 = new HashMap<>(9, 1.0f); // можно указать 2 значения, 1е кол-во эл-ов того массива,в  кот будут хранится данные и 2е в процентом соотношении до которого момента нужно заполнять текущее значение для того тчобы произвелось удвоение кол-ва элементов  нашем хранилище

            TreeMap<Integer, String> tMap = new TreeMap<>();
            tMap.put(1, "one"); System.out.println(tMap); // {1 = one}
            tMap.put(6, "six"); System.out.println(tMap); // {1= one, 6= six}
            tMap.put(4, "four"); System.out.println(tMap); //{1= one, 4 = four, 6 = six}
            tMap.put(3, "three"); System.out.println(tMap); // {1= one, 3= three,4 = four, 6 = six}
            tMap.put(2, "two"); System.out.println(tMap);    // {1= one, 2 = two , 3= three,4 = four, 6 = six}
            tMap.put(2, "two"); System.out.println(tMap.descendingKeySet()); //[6, 4, 3, 2, 1]
            tMap.put(2, "two"); System.out.println(tMap.descendingMap()); // {6=six, 4=four, 3=three, 2=two, 1=one}
            tMap.put(3, "three"); System.out.println(tMap.tailMap(3)); // {3=three, 4=four, 6=six}
    }
}
