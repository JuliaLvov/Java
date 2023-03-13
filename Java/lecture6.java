package Java;
import java.util.ArrayList;
import java.util.HashSet;

public class lecture6 {
    public static void main(String[] args) {
        var a = new HashSet<>(ArrayList.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(ArrayList.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);

        boolean res = a.addAll(b);

    }
}

//HashSet
// isEmpty() - проверка на пустоту
// add(V)- добавление элемента в коллекцию
// remove(V) - удаление элемента из коллекции
// contains(V) - проверка на включение элемента в коллекции
// clear() - удаление всех элементов коллекции
// size() - возвращает количество элементов коллекции
// addAll(Coll) - объединение множеств
// retainAll(Coll) - пересечение множеств
// removeAll(Coll) - разность множеств

//LinkedHashSet
// isEmpry() - проверка на пустоту
// add(V)- добавление элемента в коллекцию
// remove(V) - удаление элемента из коллекции
// contains(V) - проверка на включение элемента в коллекции
// clear() - удаление всех элементов коллекции
// size() - возвращает количество элементов коллекции


