package AnimalModel;

import AnimalModel.Pets.Cat;
import AnimalModel.Pets.Dog;
import AnimalModel.Pets.Hamster;
import AnimalModel.Pets.Parrot;

public class Pet {
    private Cat cat;
    private Dog dog;
    private Hamster hamster;
    private Parrot parrot;

    public Pet(Cat cat, Dog dog, Hamster hamster, Parrot parrot) {
        this.cat = cat;
        this.dog = dog;
        this.hamster = hamster;
        this.parrot = parrot;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public Hamster getHamster() {
        return hamster;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
