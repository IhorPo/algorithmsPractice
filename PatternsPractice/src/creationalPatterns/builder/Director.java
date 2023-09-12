package creationalPatterns.builder;


import creationalPatterns.builder.model.Builder;

public class Director {
    public void buildBugatti(Builder builder){
        builder.brand("Bugatti")
                .color("Blue")
                .numberOfDoors(2)
                .engine("8L");
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .numberOfDoors(2);
    }
}
