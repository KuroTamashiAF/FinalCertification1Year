package View;

import Model.Animal.Cat;
import Model.Model;

import java.io.IOException;
import java.util.Scanner;

public class View {
    private Model model;
    private Creators creators;

    public View(Creators creators, Model model) {
        this.creators = creators;
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Creators getCreators() {
        return creators;
    }

    public void greeting() {

        System.out.println("Здравствуйте кого вы хотите завести нажмите 1 " +
                "если Кошечку или 2 если Собачку");
        Scanner sc = new Scanner(System.in);
        int chooseAnimal =sc.nextInt();
        switch (chooseAnimal){
            case 1:
                model.getICatService().addCatShelter(creators.creatingCat());
                break;
            case 2:
                model.getIDogService().addDogShelter(creators.creatingDog());
                break;
            default:
                throw new RuntimeException("Введите 1 или 2 ");
        }

    }
}
