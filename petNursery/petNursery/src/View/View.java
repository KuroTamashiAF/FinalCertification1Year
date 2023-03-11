package View;

import Model.Animal.Cat;
import Model.Animal.Command;
import Model.Model;

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

    public void animalFuctions(Cat cat){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Что бы посмотеть список команд животного %s нажмите 1 \n"
        + " Что бы научить животное %s новым командам нажмите 2 ", cat.getName(), cat.getName());
        int choose =  sc.nextInt();
        switch(choose){
            case 1:
                cat.showCommands();
                break;
            case 2:
                System.out.println("Введите команду:");
                cat.addCommand(new Command(sc.next()));
                break;
            default:
                throw new RuntimeException("Нажмите 1 или 2");

        }
    }
    public Cat animalCatSelect(){
        System.out.println("Что бы выбрать животное введите его имя");
        Scanner sc = new Scanner(System.in);
        return model.getICatService().selectCat(sc.next());

    }
    public void chooseCreateAnimal() {

        System.out.println(" Кого вы хотите завести нажмите 1 " +
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
    public void lookAll(){
        model.lookAll();
    }
    public void menu(){
        System.out.println("Здравствуйте выбирите пункт меню нажав " +
                "соответствующую клавишу");
        System.out.println("Нажмите 1 что бы завести новное животное;\n"+
                "Нажмите 2 посмотреть всех животных");
        Scanner sc= new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                chooseCreateAnimal();
                break;
            case 2:
                lookAll();
                break;
            default:
                throw new RuntimeException("Нижмите 1 или 2 ");



        }

    }



}
