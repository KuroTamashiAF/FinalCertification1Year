package View;

import Model.Animal.Cat;

import java.io.IOException;
import java.util.Scanner;

public class View {
    private Creators creators;

    public View(Creators creators) {
        this.creators = creators;
    }

    public void greeting() {

        System.out.println("Здравствуйте кого вы хотите завести нажмите 1 " +
                "если Кошечку или 2 если Собачку");
        Scanner sc = new Scanner(System.in);
        int chooseAnimal =sc.nextInt();
        switch (chooseAnimal){
            case 1:

                break;
            case 2:
                break;
            default:
                throw new RuntimeException("Введите 1 или 2 ");
        }

    }
    public Cat creatingCat(){


    }
}
