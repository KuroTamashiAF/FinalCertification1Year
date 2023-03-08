package AnimalModel.Pets;

import AnimalModel.abctractAnimal;

import java.util.Date;

public class Cat extends abctractAnimal {
    public String sound;
    public Cat(String name, int age, String date){
        super(name, age,date );
        this.sound =  "meow";
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" Издаемый звук %s ", getSound());
    }

}
