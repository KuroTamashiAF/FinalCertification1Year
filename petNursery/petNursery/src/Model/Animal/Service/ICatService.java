package Model.Animal.Service;

import Model.Animal.Cat;

public interface ICatService {
    public void addCatShelter(Cat cat);
   // public void SeeAllKitties();
    public void FindKitties(String name);
    public void giveTheKitty(String name);

}
