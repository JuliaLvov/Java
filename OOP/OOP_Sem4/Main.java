package OOP.OOP_Sem4;

// import java.util.ArrayList;
// import java.util.List;

public class Main{ 
public  static void main(String[] args) {

    Arrays<Double> arrays = new Arrays<>(1.0,2.0);
    System.out.println(arrays.avg());


    Arrays<Integer> anotherArrays = new Arrays<>(1,2,3,4,5,6,7,8,9,10);
    System.out.println(arrays.sameAvg(anotherArrays));

    // Box<String> myBox = new Box<>("Hi");
    // myBox.showType();
    // System.out.println(myBox.getObj());




// Box first = new Box();
// Box second = new Box (2);
// first.setObject(1);

// int sum = ((Integer)first.getObject())+ ((Integer)second.getObject());
// System.out.println(sum);

// Box third = new Box("Hello");
// System.out.println();


//     List myList = new ArrayList();
//     // myList.add("Hello");
//     myList.add(1);
//     // String text = myList.get(0) + " World";
//     if(myList.get(0)instanceof String){
//         String text = (String) myList.get(0);
//         System.out.println(text);
//     } else{
//         System.out.println("Типы несопоставимы");
//     }
// } 
}
}
    

