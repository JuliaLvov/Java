package OOP.HM5;

public class Program {
    public static void main(String[] args) {

        // var rn = new RationalNumber();
        // var v = new View();
        Presenter p = new Presenter(new OperationsModel(), new View());
        p.buttonClickSum();

        Presenter p2 = new Presenter(new OperationsModel(), new View());
        p2.buttonClickSubtraction();
    }
}
