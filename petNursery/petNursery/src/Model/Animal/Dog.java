package Model.Animal;

import Model.Animal.Enum.Color;
import Model.Animal.Enum.Health;
import Model.Counter;

public class Dog {
    private String name;
    private Color color1;
    private Color color2;
    private Color color3;
    private int age;
    private String dateOfBirths;
    private Health health;


    public Dog(String name, Color color1, Color color2, Color color3, int age, String dateOfBirths, Health health) {
        this.name = name;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.age = age;
        this.dateOfBirths = dateOfBirths;
        this.health = health;
        Counter.add();
    }

    public Dog(Color color1) {
        this.name =  "Cat";
        this.color1 = color1;
        this.color2 = Color.Black;
        this.color3 = Color.Grey;
        this.age = 0;
        this.dateOfBirths = "N/A";
        this.health =Health.Needs_treatment;
        Counter.add();
    }

    public String getName() {
        return name;
    }

    public Color getColor1() {
        return color1;
    }

    public Color getColor2() {
        return color2;
    }

    public Color getColor3() {
        return color3;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirths() {
        return dateOfBirths;
    }

    public Health getHealth() {
        return health;
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

    public void setHealth(Health health) {
        this.health = health;
    }
}
