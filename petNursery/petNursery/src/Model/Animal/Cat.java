package Model.Animal;

import Model.Animal.Enum.Color;
import Model.Animal.Enum.Health;
import Model.Counter;

public class Cat {
    private String name;
    private int age;
    private String dateOfBirths;



    public Cat(String name, int age, String dateOfBirths) {
        this.name = name;
        this.age = age;
        this.dateOfBirths = dateOfBirths;
        Counter.add();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirths() {
        return dateOfBirths;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirths(String dateOfBirths) {
        this.dateOfBirths = dateOfBirths;
    }

}
