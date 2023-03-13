package Java;
import java.util.Random;

public class seminar1 {

static String str = "f";

    public static void main(String[]args){
        

        int[] ints = new int[10];
        
    System.out.print(ints[4]);
    System.out.println(Integer.toBinaryString(75843));

    Random random = new Random();

for (int i =0 ; i < ints.length; i++){
    ints[i] = random.nextInt(100);
    if (ints[i] %2 !=0) {
        System.out.println(ints[i]);
    }
    
}

int[] tmp = new int[ints.length + ints.length/2 + 1];
for (int i = 0; i <ints.length; i++){
    tmp[i] = ints[i];
}
ints = tmp;

str = "Hello World";
str += "!";
String str2 = "Hello";

System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str);
if (str.equals(str2)) System.out.println("Equal!");
if (str.contains(str2)) System.out.println("Contains");
System.out.println("Hi!".repeat(5));
System.out.println(str.replace(str2, "Big"));
String[] sStr = str.split("!");

int a = 0;

    }


}

