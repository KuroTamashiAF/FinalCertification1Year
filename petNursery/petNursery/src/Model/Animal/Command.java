package Model.Animal;

public class Command {
    private String commandtext;

    public Command(String commandtext) {
        this.commandtext = commandtext;
    }

    public String getCommandtext() {
        return commandtext;
    }

    public void setCommandtext(String commandtext) {
        this.commandtext = commandtext;
    }
}
