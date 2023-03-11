package View;

import Model.Animal.Cat;
import Model.Animal.Dog;

import java.util.Scanner;

public class Creators {


    public Cat creatingCat(){
        System.out.println("Введите имя, возраст, и примерную дату рождения через ENTER");
        Scanner sc = new Scanner(System.in);
        return new Cat(sc.next(), sc.nextInt(), sc.next());

    }
    public Dog creatingDog(){
        System.out.println("Введите имя, возраст, и примерную дату рождения через ENTER");
        Scanner sc = new Scanner(System.in);
        return new Dog(sc.next(), sc.nextInt(), sc.next());

    }





}
