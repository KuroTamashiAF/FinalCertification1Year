package Model.Animal.Service;

import Model.Animal.Cat;
import Model.Animal.Repository.CatRepo;

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
        if (cat.getComandList().isEmpty())
            System.out.println("Данное животное еще ничего не умеет! Научите!");
        catRepo.getRepoCats().get(catRepo.findCatIndex(cat.getName())).showCommands();
    }

    @Override
    public void showAllKitty() {
        catRepo.showRepoCats();

    }

    @Override
    public Cat selectCat(String name) {
        return catRepo.findCat(name);

    }

}
