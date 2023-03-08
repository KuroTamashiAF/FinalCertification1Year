package AnimalModel.Pets;

import AnimalModel.Abstract.abctractAnimal;

public class Hamster extends abctractAnimal {


    public Hamster(String name, int age, String dateOfBith) {
        super(name, age, dateOfBith);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
