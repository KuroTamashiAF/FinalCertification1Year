package AnimalModel.packAnimals;

import AnimalModel.Abstract.abctractAnimal;

public class Ram extends abctractAnimal {
    private int quantityWoolKg;

    public Ram(String name, int age, String dateOfBith, int quantityWoolKg) {
        super(name, age, dateOfBith);
        this.quantityWoolKg = quantityWoolKg;
    }

    public int getQuantityWoolKg() {
        return quantityWoolKg;
    }

    @Override
    public String toString() {
        return super.toString()+
                String.format(" Количество шерсти %d кг ", getQuantityWoolKg());
    }
}
