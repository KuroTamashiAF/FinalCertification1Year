package AnimalModel.packAnimals;

import AnimalModel.Abstract.abctractAnimal;

public class Camel extends abctractAnimal {

    private int loadCapacity;

    public Camel(String name, int age, String dateOfBith, int loadCapacity) {
        super(name, age, dateOfBith);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" Грузоподъемность %d кг ", getLoadCapacity());
    }
}
