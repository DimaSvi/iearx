public class Transport {

    protected String brand;
    protected String model;
    protected int year;

    public Transport(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getInfo() {
        return "Марка: " + brand + ", Модель: " + model + ", Рік: " + year;
    }
}