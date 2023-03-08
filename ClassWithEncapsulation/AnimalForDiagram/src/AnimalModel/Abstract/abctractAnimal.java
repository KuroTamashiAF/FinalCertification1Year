package AnimalModel.Abstract;

import java.util.Date;

public abstract class abctractAnimal {
    private String name;
    private int age;
    private String dateOfBith;

    public abctractAnimal(String name, int age, String dateOfBith) {
        this.name = name;
        this.age = age;
        this.dateOfBith = dateOfBith;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBith() {
        return dateOfBith;
    }

    @Override
    public String toString() {
        String result = String.format("Имя %s, Возраст %d, день рождения %s", getName(), getAge(), getDateOfBith());
        return result;
    }
}
