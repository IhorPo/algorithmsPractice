package creationalPatterns.abstractFactory.model;

public class Ship implements Transport{
    private String name;
    private String size;

    public Ship(String name, String size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void ride() {
        System.out.println("Ride on ship");
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
