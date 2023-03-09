package Model.Animal;

import Model.Counter;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private int age;
    private String dateOfBirths;
    private List<Command> comandList;


    public Animal(String name, int age, String dateOfBirths) {
        this.name = name;
        this.age = age;
        this.dateOfBirths = dateOfBirths;
        Counter.add();
        comandList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirths() {
        return dateOfBirths;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirths(String dateOfBirths) {
        this.dateOfBirths = dateOfBirths;
    }
    public void addCommand(Command command){
        comandList.add(command);
    }
    public void showCommands(){
        int i =1;
        for (Command command:comandList) {
            System.out.printf("Команда № %d - %s \n",i,command.getCommandtext() );
            i++;
        }
    }
}
