package SOLID.OCP.User;

import SOLID.OCP.Control.RemoteControl;
import SOLID.OCP.Devices.Projector;
import SOLID.OCP.Devices.SurroundSoundSystem;

public class Person {
    public static void main(String[] args) {
        Projector project = new Projector();
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();

        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(project);
        remoteControl.clickOnButton(project);
        remoteControl.clickOffButton(project);

        remoteControl.connectToDevice(surroundSoundSystem);
        remoteControl.clickOnButton(surroundSoundSystem);

    }
}
