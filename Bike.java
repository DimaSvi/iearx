public class Bike extends Transport {

    private int engineVolume;

    public Bike(String brand, String model, int year, int engineVolume) {
        super(brand, model, year);
        this.engineVolume = engineVolume;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Об'єм двигуна: " + engineVolume + " куб.см";
    }
}