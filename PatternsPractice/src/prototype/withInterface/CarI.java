package prototype.withInterface;

public class CarI implements TransportI{
    private int id;
    private String name;
    
    CarI(){
        
    }
    public CarI(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public TransportI clone() {
        return new CarI(id,name);
    }
}
