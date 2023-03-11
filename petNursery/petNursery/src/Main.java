import Model.Animal.Animal;
import Model.Animal.Cat;
import Model.Animal.Dog;
import Model.Animal.Repository.CatRepo;
import Model.Animal.Repository.DogRepo;
import Model.Animal.Service.CatService;
import Model.Animal.Service.DogService;
import Model.Animal.Service.ICatService;
import Model.Animal.Service.IDogService;
import Model.Model;
import View.Creators;
import View.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatRepo catRepo = new CatRepo();
        DogRepo dogRepo = new DogRepo();
        Cat cat1 = new Cat("Масяня", 5, "05.05.2018");
        Cat cat2 = new Cat("Кусака", 13, "30.07.2010");
        Cat cat3 = new Cat("Вредняка", 6, "15.11.2017");
        Dog dog1 = new Dog("Хороший мальчик", 6, "11.02.2017");
        Dog dog2 = new Dog("Дибил", 3, "11.02.2020");
        catRepo.addCat(cat1);
        catRepo.addCat(cat2);
        catRepo.addCat(cat3);
        dogRepo.addDog(dog1);
        dogRepo.addDog(dog2);
        ICatService iCatService = new CatService(catRepo);
        IDogService iDogService = new DogService(dogRepo);
        Model model = new Model(iDogService,iCatService );
        Creators creators = new Creators();
        View view00 = new View(creators,model );
        int chose = 99;
        do {
            view00.menu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Для завершения программы нажмите 0, для продолжения любую цифру, " +
                    "кроме клавиши Enter ");
            chose = sc.nextInt();
            }while (chose !=0);

        }

    }