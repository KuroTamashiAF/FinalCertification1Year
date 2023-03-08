package AnimalModel.packAnimals;

import AnimalModel.Abstract.abctractAnimal;

public class Cow extends abctractAnimal {

    private boolean givesMilk;

    public Cow(String name, int age, String dateOfBith, boolean givesMilk) {
        super(name, age, dateOfBith);
        this.givesMilk = givesMilk;
    }

    public boolean isGivesMilk() {
        return givesMilk;
    }

    @Override
    public String toString() {
        return super.toString()+
                String.format("Дает молоко %s", isGivesMilk());
    }
}
