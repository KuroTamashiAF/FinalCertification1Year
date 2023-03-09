import Model.Animal.Cat;
import Model.Animal.Dog;
import Model.Animal.Enum.Color;
import Model.Animal.Enum.Health;
import Model.Animal.Repository.CatRepo;
import Model.Animal.Repository.DogRepo;
import Model.Animal.Service.CatService;
import Model.Counter;

public class Main {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Васян", Color.Black,Color.Grey, Color.Green, 3,"15.07.2020", Health.Good );
       Cat cat2 = new Cat("Гумя", Color.Black,Color.Grey, Color.Green, 3,"15.07.2020", Health.Good );
       Cat cat3 = new Cat("Жара", Color.Black,Color.Grey, Color.Green, 3,"15.07.2020", Health.Good );
       Dog dog1 = new Dog("кошак", Color.Black,Color.Grey, Color.Green, 3,"15.07.2020", Health.Good );
       Dog dog2 = new Dog("Зверь", Color.Black,Color.Grey, Color.Green, 3,"15.07.2020", Health.Good );
       Dog dog3 = new Dog("джой", Color.Black,Color.Grey, Color.Green, 3,"15.07.2020", Health.Good );
        System.out.println(Counter.getCounter());
        CatRepo catRepo = new CatRepo();
        catRepo.addCat(cat1);
        catRepo.addCat(cat2);
        DogRepo dogRepo = new DogRepo();
        dogRepo.addDog(dog1);
        dogRepo.addDog(dog2);
        CatService catService = new CatService(catRepo);
        catService.addCatShelter(cat3);



    }
}