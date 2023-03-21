package OOP.OOP_Sem4;


public class Box<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType(){
        System.out.println("Тип Т:" + obj.getClass().getName());
    }
       
    // E - элемент какой-либой коллекции
    // K - ключей map
    // V - значений мар
    // N - для чисел
    // Т - тип параметра в произвольных классах
    // S, U, V... -  в случае множественнх дженериков
    // ? - метасимвол(wildcard)
    
}
