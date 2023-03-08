package AnimalModel;

import java.util.Date;

public class Cat extends abctractAnimal{
    public String sound;
    Cat(String name, int age, Date date){
        super(name, age,date );
        this.sound =  "meow";
    }

    public String getSound() {
        return sound;
    }


    @Override
    public String toString() {
        String result = String.format("Имя %s, Возраст %d, день рождения %s, " +
                "Издаваемый звук %s", getName(), getAge(), getDateOfBith(), getSound());
        return result;
    }

        return super.toString();
    }
}
