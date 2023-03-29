package OOP.HM7;

public abstract class BasePhone implements Call{
    protected String model;

    public BasePhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
}
