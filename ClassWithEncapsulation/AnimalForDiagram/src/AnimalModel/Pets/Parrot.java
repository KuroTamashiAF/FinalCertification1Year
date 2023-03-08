package AnimalModel.Pets;

import AnimalModel.abctractAnimal;

public class Parrot extends abctractAnimal {
    private boolean toTalk;

    public Parrot(String name, int age, String dateOfBith, boolean toTalk) {
        super(name, age, dateOfBith);
        this.toTalk = toTalk;
    }

    public boolean isToTalk() {
        return toTalk;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" Говорит ? %s", isToTalk());
    }
}
