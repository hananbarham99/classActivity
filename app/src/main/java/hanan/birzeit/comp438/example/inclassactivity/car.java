package hanan.birzeit.comp438.example.inclassactivity;

public class car {
    private String name;
    private String model;
    private int number;

    public int getPrice() {
        return price;
    }

    private int price;

    public static final car[]cars = {};

    private car(String name, String model, int number, int price){
        this.name = name;
        this.model = model;
        this.number = number;
        this.price = price;

    }
    public String getName(){return name;}
    public String getModel(){return model;}
    public int getNumber(){return number;}

    @Override
    public String toString(){return name;}
}