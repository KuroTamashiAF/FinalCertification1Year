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

//    @Override
//    public void SeeAllKitties() {
//
//    }

    @Override
    public void FindKitties(String name) {
        catRepo.findCat(name)
    }

    @Override
    public void giveTheKitty(String name) {

    }
}
