package OOP.OOP_Sem4;

public class Arrays<T extends Number> { 
    private T[] nums;

    public Arrays(T...nums){ //....означает неограниченный набор элементов
        this.nums = nums;
    }

    public double avg(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum +=nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    public boolean sameAvg(Arrays<?> arrays){
        return Math.abs((this.avg()-arrays.avg())) < 0.0001;  //math.abs (absolute) сравнение по модулю
    }
}
