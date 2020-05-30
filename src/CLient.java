import GeräteKlassen.Light;
import GeräteKlassen.Stereo;
import MethodenKlassen.LightOnCommand;
import MethodenKlassen.StereoOffCommand;
import MethodenKlassen.StereoOnCommand;

public class CLient {
    public static void main(String[] args) {
        Stereo Anlage1 = new Stereo();
        Stereo Anlage2 = new Stereo();
        Light Licht1 = new Light();
        Light Licht2 = new Light();

        Remote IntelligenteFernbedienung = new Remote();
        IntelligenteFernbedienung.setCurrentCommand(new StereoOnCommand(Anlage1));
        IntelligenteFernbedienung.buttonPressed();
        IntelligenteFernbedienung.setCurrentCommand(new LightOnCommand(Licht1));
        IntelligenteFernbedienung.buttonPressed();

    }
}
