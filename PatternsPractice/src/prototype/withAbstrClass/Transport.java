package prototype.withAbstrClass;

public abstract class Transport {
    private int id;
    private String color;

    public Transport(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public Transport(Transport transport){
        this.id = transport.id;
        this.color = transport.color;
    }

    public abstract Transport clone();

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
