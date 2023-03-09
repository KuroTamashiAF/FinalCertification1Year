import Model.Animal.Cat;
import Model.Animal.Dog;
import Model.Animal.Enum.Color;
import Model.Counter;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(Color.Black);
        Cat cat2 = new Cat(Color.Black);
        Cat cat3 = new Cat(Color.Black);
        Cat cat4 = new Cat(Color.Black);
        Cat cat5 = new Cat(Color.Black);
        Dog Dog1 = new Dog(Color.Black);
        System.out.println(Counter.getCounter());


    }
}