import Model.Animal.Cat;
import Model.Animal.Command;
import Model.Animal.Dog;
import Model.Animal.Repository.CatRepo;
import Model.Animal.Repository.DogRepo;
import Model.Animal.Service.CatService;
import Model.Counter;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(" ddd", 10, "15.07.1991");
        Command command = new Command("Лежать");
        Command command1 = new Command("Сидеть");
        Command command2 = new Command("Летать ");
        Command command3 = new Command("Стоять");
        cat.addCommand(command);
        cat.addCommand(command1);
        cat.addCommand(command2);
        cat.addCommand(command3);
        cat.showCommands();

    }
}