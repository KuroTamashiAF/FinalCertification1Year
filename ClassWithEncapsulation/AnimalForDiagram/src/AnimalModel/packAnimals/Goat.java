package AnimalModel.packAnimals;

import AnimalModel.abctractAnimal;

public class Goat extends abctractAnimal {
    private boolean  buttingHeads;
    private boolean givesMilk;

    public Goat(String name, int age, String dateOfBith, boolean buttingHeads, boolean givesMilk) {
        super(name, age, dateOfBith);
        this.buttingHeads = buttingHeads;
        this.givesMilk = givesMilk;
    }

    public boolean isButtingHeads() {
        return buttingHeads;
    }

    public boolean isGivesMilk() {
        return givesMilk;
    }

    @Override
    public String toString() {
        return super.toString()+
                String.format(" Бодаеться %s, Дает молоко %s", isButtingHeads(), isGivesMilk());
    }
}
