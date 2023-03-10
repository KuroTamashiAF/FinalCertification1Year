package Model.Animal.Repository;

import Model.Animal.Cat;
import Model.Animal.Dog;

import java.util.ArrayList;
import java.util.List;

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

    public int findDog(String name) {
        int index = 0;
        for (Dog dog : repoDogs) {
            if (dog.getName().equals(name)) {
                return index;
            }
            index++;
        }
        return index;
    }

    public void giveAwayDog(String name) {
        repoDogs.remove(findDog(name));
    }

    public void showRepoDogs() {
        for (Dog dog : repoDogs) {
            System.out.printf("Имя %s, возраст %d , дата рождения %s\n",
                    dog.getName(), dog.getAge(), dog.getDateOfBirths());
        }
    }
}
