package AnimalModel;

import java.util.Date;

public class Dog extends abctractAnimal{
    public String sound;
    Dog(String name, int age, Date date){
        super(name, age,date );
        this.sound =  "Woof";
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" Издаемый звук %s ", getSound());
    }

}

