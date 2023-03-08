package OOP.HM1;


public class main2 {
    public static void main(String[] args) {
        person2 person = new person2("Владелец шкафа");
        closet closet = new closet("Шкаф");

        System.out.println(person);
        System.out.println(closet);
        person.action(closet.getAction());
        person.action(closet.getAction());
        person.action(closet.getAction());

        System.out.println(person.getInfo());
        System.out.println(closet.getInfo());
        closet.AcceptBooks(person.PutBooks(3));
        System.out.println(closet.getInfo());

    } 

}
