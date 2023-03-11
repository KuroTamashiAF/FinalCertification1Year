package Model.Animal.Repository;

import Model.Animal.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatRepo {
    private List<Cat> repoCats;

    public CatRepo() {
        this.repoCats = new ArrayList<>();
    }

    public List<Cat> getRepoCats() {
        return repoCats;
    }
    public void addCat(Cat cat){
        repoCats.add(cat);
        
    }
    public int findCatIndex(String name)
    {
        int index =0;
        for (Cat cat: repoCats) {
            if (cat.getName().equals(name)){
                return index;
            }
            index++;
        }
        return index;
    }
    public Cat findCat(String name){


        for (Cat cat: repoCats) {
            if (cat.getName().equals(name)){
                return cat;
            }
        }
        System.out.print("Такой кошечки не найлено занесите её в базу" );
        Scanner sc = new Scanner(System.in);
        return new Cat(sc.next(), sc.nextInt(), sc.next());
    }
    public void giveAwayCat(String name){
        repoCats.remove(findCatIndex(name));
    }
    public void showRepoCats(){
        if (repoCats.isEmpty())
            throw new RuntimeException("В питомнике нет клшек =((");

        for (Cat cat: repoCats) {
            System.out.printf("Имя %s, возраст %d , дата рождения %s\n",
                    cat.getName(), cat.getAge(),cat.getDateOfBirths()  );
        }

    }


}
