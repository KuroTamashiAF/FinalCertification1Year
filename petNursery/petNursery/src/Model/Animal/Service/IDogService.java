package Model.Animal.Service;

import Model.Animal.Cat;
import Model.Animal.Dog;

public interface IDogService {
    public void addDogShelter(Dog dog);
    public void giveTheDog(String name);
    public void showListCommands(Dog dog);
    public void showAllDog();
    public Dog selectDog(String name);

}
