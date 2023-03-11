import Model.Animal.Cat;
import Model.Animal.Iadditional;
import Model.Animal.Repository.CatRepo;
import Model.Animal.Repository.DogRepo;
import Model.Animal.Service.CatService;
import Model.Animal.Service.DogService;
import Model.Animal.Service.ICatService;
import Model.Animal.Service.IDogService;
import Model.Model;
import View.Creators;
import View.View;

public class Main {
    public static void main(String[] args) {
        CatRepo catRepo = new CatRepo();
        DogRepo dogRepo = new DogRepo();
        ICatService iCatService = new CatService(catRepo);
        IDogService iDogService = new DogService(dogRepo);
        Model model = new Model(iDogService,iCatService );
        Creators creators = new Creators();
        View view00 = new View(creators,model );
        view00.menu();













    }
}