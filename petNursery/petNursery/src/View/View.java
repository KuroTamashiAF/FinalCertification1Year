package View;

import Model.Animal.Cat;
import Model.Animal.Command;
import Model.Animal.Dog;
import Model.Model;

import java.util.InputMismatchException;
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

    public void catFuctions(Cat cat){
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
    public void dogFuctions(Dog dog){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Что бы посмотеть список команд животного %s нажмите 1 \n"
                + " Что бы научить животное %s новым командам нажмите 2 ", dog.getName(), dog.getName());
        int choose =  sc.nextInt();
        switch(choose){
            case 1:
                dog.showCommands();
                break;
            case 2:
                System.out.println("Введите команду:");
                dog.addCommand(new Command(sc.next()));
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
    public Dog animalDogSelect() {
        System.out.println("Что бы выбрать животное введите его имя");
        Scanner sc = new Scanner(System.in);
        return model.getIDogService().selectDog(sc.next());
    }
    public void workWithCat() {

        System.out.println("Завести новую кошечку нажмите 1 \n"+
                "Посмотреть всех кошек в питомнике нажмите 2");
        Scanner sc = new Scanner(System.in);
        int chooseAnimal =sc.nextInt();
        switch (chooseAnimal){
            case 1:
                model.getICatService().addCatShelter(creators.creatingCat());
                break;
            case 2:
                model.getICatService().showAllKitty();
            default :
                break;
        }
    }
    public void workWithdog() {

        System.out.println("Завести новую собачку нажмите 1 \n"+
                "Посмотреть всех собак в питомнике нажмите 2");
        Scanner sc = new Scanner(System.in);
        int chooseAnimal =sc.nextInt();
        switch (chooseAnimal){
            case 1:
                model.getIDogService().addDogShelter(creators.creatingDog());
                break;
            case 2:
                model.getIDogService().showAllDog();
            default :
                break;
        }
    }
    public void lookAll(){
        model.lookAll();
    }
    public void menu(){
        System.out.println("Здравствуйте выбирите пункт меню нажав " +
                "соответствующую клавишу\n " + "В данном питомнике содержатся только кошки и собаки");
        System.out.println("Кто вас интересуетя:\n 1 - Кошки \n 2 - Собаки");
            try {
                Scanner sc = new Scanner(System.in);
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Вы выбрали Кошек!");
                        workWithCat();
                        catFuctions(animalCatSelect());
                        break;
                    case 2:
                        System.out.println("Вы выбрали Собак!");
                        workWithdog();
                        dogFuctions(animalDogSelect());
                        break;
                    default:
                        throw new RuntimeException("Нижмите 1 или 2 ");
                }
            }catch (InputMismatchException e){
                System.out.println("В поле возраст необходимо вводить цифры");
            }catch (RuntimeException e){
                System.out.println("Следуйте инструкциям вводите только те цифры что указаны");
            }

    }



}
