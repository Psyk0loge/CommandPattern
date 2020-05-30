import MethodenKlassen.Command;

public class Remote {
    Command currentCommand;
    public void setCurrentCommand(Command command){
        this.currentCommand=command;
    }
    public void buttonPressed(){
        currentCommand.execute();
    }
}
