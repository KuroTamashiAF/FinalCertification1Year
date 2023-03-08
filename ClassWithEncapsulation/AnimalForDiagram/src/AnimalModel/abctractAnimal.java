package AnimalModel;

import java.util.Date;

public abstract class abctractAnimal {
    private String name;
    private int age;
    private Date dateOfBith;

    public abctractAnimal(String name, int age, Date dateOfBith) {
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

    public Date getDateOfBith() {
        return dateOfBith;
    }

    @Override
    public String toString() {
        String result = String.format("Имя %s, Возраст %d, день рождения %s", getName(), getAge(), getDateOfBith());
        return result;
    }
}
