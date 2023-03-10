package Model.Animal.Service;

import Model.Animal.Cat;
import Model.Animal.Repository.CatRepo;

import java.util.ArrayList;
import java.util.List;

public class CatService implements ICatService{
    private CatRepo catRepo;

    public CatService(CatRepo catRepo) {
        this.catRepo = catRepo;
    }

    public CatRepo getCatRepo() {
        return catRepo;
    }

    @Override
    public void addCatShelter(Cat cat) {
        catRepo.addCat(cat);

    }
    @Override
    public void giveTheKitty(String name) {
        catRepo.giveAwayCat(name);

    }

    @Override
    public void showListCommands(Cat cat) {
        catRepo.getRepoCats().get(catRepo.findCat(cat.getName())).showCommands();
    }

    @Override
    public void showAllKitty() {
        catRepo.showRepoCats();

    }

}
