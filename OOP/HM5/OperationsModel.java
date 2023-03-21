package OOP.HM5;

public class OperationsModel extends RationalNumber {

    public OperationsModel(){

    }
    @Override
    public double sum(){
        return firstNumber + secondNumber;
    }
    @Override
    public double subtraction() {
        return firstNumber - secondNumber ;
    }
    @Override
    public double multiplication() {
        return firstNumber * secondNumber ;
    }
    @Override
    public double division() {
        return firstNumber / secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        super.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        super.secondNumber = secondNumber;
    }

    
}
