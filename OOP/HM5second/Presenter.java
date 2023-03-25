package OOP.HM5second;

public class Presenter {
    View view;
    ComplexNumbersCalculation complexNumbersCalculation;
    RationalNumbersCalculation rationalNumbersCalculation;
    Menu menu;

    public Presenter (ComplexNumbersCalculation cnc, RationalNumbersCalculation rnc,  View v, Menu menu ){
        complexNumbersCalculation = cnc;
        rationalNumbersCalculation = rnc;
        view = v;
        this.menu = menu;
    }

    public void start(){
        while (true){
            switch (menu.selectCalc()){
                case "1":
                complexNumbersCalculation.sum();
                complexNumbersCalculation.diff();
                complexNumbersCalculation.multiply();
                complexNumbersCalculation.div();
                case "2":
                rationalNumbersCalculation.sum();
                rationalNumbersCalculation.diff();
                rationalNumbersCalculation.multiply();
                rationalNumbersCalculation.div();

            }
        }
    }



   
    

}
