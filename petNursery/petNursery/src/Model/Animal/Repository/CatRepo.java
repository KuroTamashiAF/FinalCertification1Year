package Model.Animal.Repository;

import Model.Animal.Cat;

import java.util.ArrayList;
import java.util.List;

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
    public int findCat(String name)
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
    public void giveAwayCat(String name){
        repoCats.remove(findCat(String name));
        
    }
}
