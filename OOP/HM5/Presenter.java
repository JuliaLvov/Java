package OOP.HM5;

public class Presenter {
    View view;
    // RationalNumber rationalNumber;
    RationalCalcModel rationalCalcModel;

    public Presenter (RationalCalcModel rn, View v ){
        rationalCalcModel = rn;
        view = v;
    }

    public void buttonClickSum(){
        double firstNumber = view.getNumber("Введите первое рациональное число: ");
        double secondNumber = view.getNumber("Введите второе рациональное число:");
        rationalCalcModel.setFirstNumber(firstNumber);
        rationalCalcModel.setSecondNumber(secondNumber);
        double sum = rationalCalcModel.sum();
        view.print(sum, "Сумма чисел ");

    }

    public void buttonClickSubtraction(){
        double firstNumber = view.getNumber("\nВведите первое рациональное число: ");
        double secondNumber = view.getNumber("Введите второе рациональное число:");
        rationalCalcModel.setFirstNumber(firstNumber);
        rationalCalcModel.setSecondNumber(secondNumber);
        double subtraction = rationalCalcModel.subtraction();
        view.print(subtraction, "Результат вычитания: ");

    }



}
