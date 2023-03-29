package OOP.HM7;

public class Smartphone extends BasePhone implements Email, SMS {


    public Smartphone(String model){ 
        super(model);  
    }

    @Override
    public void doCall() {
    }

    @Override
    public void SendEmail() {
    }

    @Override
    public void SendSms() {
        
    }
}