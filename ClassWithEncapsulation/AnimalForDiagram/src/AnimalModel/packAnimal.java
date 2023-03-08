package AnimalModel;

import AnimalModel.packAnimals.*;

public class packAnimal {
    private Camel camel;
    private Cow cow;
    private Goat goat;
    private Horse horse;
    private Ram ram;

    public packAnimal(Camel camel, Cow cow, Goat goat, Horse horse, Ram ram) {
        this.camel = camel;
        this.cow = cow;
        this.goat = goat;
        this.horse = horse;
        this.ram = ram;

    }

    public Camel getCamel() {
        return camel;
    }

    public Cow getCow() {
        return cow;
    }

    public Goat getGoat() {
        return goat;
    }

    public Horse getHorse() {
        return horse;
    }

    public Ram getRam() {
        return ram;
    }
}
