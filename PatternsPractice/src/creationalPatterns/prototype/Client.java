package creationalPatterns.prototype;

import creationalPatterns.prototype.withAbstrClass.Car;
import creationalPatterns.prototype.withAbstrClass.Ship;
import creationalPatterns.prototype.withAbstrClass.Transport;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Transport> list = List.of(
                new Car(1,"Bugatti","blue"),
                new Car(2,"Lamborghini","yellow"),
                new Ship(1,"red","medium")
        );

        List<Transport> copyList = new ArrayList<>();
        for(Transport t:list){
            copyList.add(t.clone());
        }

        copyList.forEach(n -> System.out.println(n));
//        List<TransportI> list = List.of(
//                new CarI(1,"Bugatti"),
//                new CarI(2,"Lamborghini")
//        );
//        List<TransportI> l1 = new ArrayList<>();
//        for(TransportI i: list){
//            l1.add(i.clone());
//        }
    }
}
