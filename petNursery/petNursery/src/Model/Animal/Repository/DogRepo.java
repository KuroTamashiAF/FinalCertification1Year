package Model.Animal.Repository;

import Model.Animal.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogRepo {
    private List<Dog> repoDogs;

    public DogRepo() {
        this.repoDogs = new ArrayList<>();
    }

    public List<Dog> getRepoDogs() {
        return repoDogs;
    }

    public void addDog(Dog dog) {
        repoDogs.add(dog);

    }

    public int findDogIndex(String name) {
        int index = 0;
        for (Dog dog : repoDogs) {
            if (dog.getName().equals(name)) {
                return index;
            }
            index++;
        }
        return index;
    }
    public Dog findDog(String name) {
        for (Dog dog : repoDogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Такой собачки в питомнике нету занесите её в базу");
        return new Dog(sc.next(), sc.nextInt(), sc.next());
    }

    public void giveAwayDog(String name) {
        repoDogs.remove(findDogIndex(name));
    }

    public void showRepoDogs() {
        for (Dog dog : repoDogs) {
            System.out.printf("Имя %s, возраст %d , дата рождения %s\n",
                    dog.getName(), dog.getAge(), dog.getDateOfBirths());
        }
    }
}
