package OOP.HM5second;

public class Presenter {
    View view;
    ComplexNumbersCalculation complexNumbersCalculation;
    RationalNumbersCalculation rationalNumbersCalculation;
    Menu menu;

    public Presenter (ComplexNumbersCalculation cnc, RationalNumbersCalculation rnc,  View v, Menu menu ){
        complexNumbersCalculation = cnc;
        rationalNumbersCalculation = rnc;
        this.menu = menu;
        view = v;
        
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
                case "0":
                System.exit(0);

            }
        }
    }

    // Presenter p = new Presenter(new OperationsModel(), new View());
    // p.buttonClickSum();

    // Presenter p2 = new Presenter(new OperationsModel(), new View());
    // p2.buttonClickSubtraction();

   
    // public void buttonClickSum(){
    //     double firstNumber = view.getNumber("Введите первое рациональное число: ");
    //     double secondNumber = view.getNumber("Введите второе рациональное число:");
    //     rationalCalcModel.setFirstNumber(firstNumber);
    //     rationalCalcModel.setSecondNumber(secondNumber);
    //     double sum = rationalCalcModel.sum();
    //     view.print(sum, "Сумма чисел ");

    // }
   
   
    

}
