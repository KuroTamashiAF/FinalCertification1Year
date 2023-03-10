package Model.Animal.Service;

import Model.Animal.Cat;
import Model.Animal.Dog;
import Model.Animal.Repository.DogRepo;

public class DogService implements IDogService{
    private DogRepo dogRepo;

    public DogService(DogRepo dogRepo) {
        this.dogRepo= dogRepo;
    }

    public DogRepo getDogRepo() {
        return dogRepo;
    }

    @Override
    public void addDogShelter(Dog dog) {
        getDogRepo().addDog(dog);

    }
    @Override
    public void giveTheDog(String name) {
        dogRepo.giveAwayDog(name);
    }

    @Override
    public void showListCommands(Dog dog) {
        dogRepo.getRepoDogs().get(dogRepo.findDog(dog.getName())).showCommands();
    }

    @Override
    public void showAllDog() {
        dogRepo.showRepoDogs();
    }
}
