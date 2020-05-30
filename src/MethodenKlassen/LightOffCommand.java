package MethodenKlassen;

import GeräteKlassen.Light;


public class LightOffCommand implements Command{
    Light light;
    public void LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
