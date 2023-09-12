package creationalPatterns.prototype.withAbstrClass;

public class Ship extends Transport{
    private String size;
    public Ship(int id, String color, String size){
        super(id,color);
        this.size = size;
    }

    public Ship(Ship ship){
        super(ship);
        this.size = ship.size;
    }
    @Override
    public Transport clone() {
        return new Ship(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Ship{" +
                "size='" + size + '\'' +
                '}';
    }
}
