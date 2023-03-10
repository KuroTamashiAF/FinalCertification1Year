package Model.Animal.Service;

import Model.Animal.Cat;

public interface ICatService {
    public void addCatShelter(Cat cat);
    public void giveTheKitty(String name);
    public void showListCommands(Cat cat);
    public void showAllKitty();


}
