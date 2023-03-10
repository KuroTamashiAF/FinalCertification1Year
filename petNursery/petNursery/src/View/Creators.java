package View;

import Model.Animal.Cat;

import java.util.Scanner;

public class Creators {


    public Cat creatingCat(){
        System.out.println("Введите имя, возраст, и примерную дату рождения через ENTER");
        Scanner sc = new Scanner(System.in);
        return new Cat(sc.next(), sc.nextInt(), sc.next());

    }





}
