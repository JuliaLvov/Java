package OOP.HM5second;

public class ComplexNumbers extends GeneralNumberDescriptor{
    
    public ComplexNumbers(double x, double y){
        this.setX(x);
        this.setY(y);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.getX() == 0 && this.getY() == 0) return "0";
        if (this.getX() != 0) sb.append(this.getX());
        if (this.getY() != 0) {
            if (this.getY() > 0) sb.append("+");
            sb.append(this.getY());
            sb.append("i");
        }
        return sb.toString();
    }
    
    
}
