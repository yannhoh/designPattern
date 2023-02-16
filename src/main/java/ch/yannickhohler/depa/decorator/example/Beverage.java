package ch.yannickhohler.depa.decorator.example;

public abstract class Beverage {
    protected String description;
    protected double price;
    private final Size size;
    public enum Size {Small, Medium, Large}
    protected Beverage(Size size) {
        this.size = size;
        this.description = "Beverage";
        this.price = 0.0;
    }
    public double cost(){
        return price;
    }
    public String getDescription() {
        return description;
    }
    public Size getSize() {
        return size;
    }
}
