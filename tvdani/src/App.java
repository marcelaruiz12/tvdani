import java.util.ArrayList;
import java.util.List;

import commands.Command;
import commands.TurnOffDevices;
import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeDownRadio;
import commands.VolumeDownTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Television;




public class App {

public static void main(String[] args) throws Exception {
ElectronicDevice televisionOne = new Television("IPHONE");
TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

DeviceButton onPressed;
onPressed = new DeviceButton(onCommand);
onPressed.press();

TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
onPressed = new DeviceButton(offCommand);
onPressed.press();

VolumeUpTelevision  volUpCommandTV = new VolumeUpTelevision(televisionOne);
onPressed = new DeviceButton(volUpCommandTV);
onPressed.press();
onPressed.press();
onPressed.press();

VolumeDownTelevision volumeDownCommandTV = new  VolumeDownTelevision(televisionOne);

onPressed = new DeviceButton(volumeDownCommandTV);
onPressed.press();

ElectronicDevice televisionTwo = new Television("SAMSUNG");
ElectronicDevice radioFour = new Radio("UNO");


List<ElectronicDevice> allDevices = new ArrayList<>();

allDevices.add(televisionTwo);
allDevices.add(radioFour);

TurnOffDevices turnOffDevices = TurnOffAllDevices(allDevices);
DeviceButton turnThemOff = new DeviceButton(TurnOffAllDevices(null));

turnThemOff.press();
turnThemOff.pressUndo();


ElectronicDevice radioTree = new Radio("IPHONE");

TurnOnRadio onCommandtwo = new TurnOnRadio(radioTree);

DeviceButton onPressedtwo;
onPressed = new DeviceButton(onCommand);
onPressed.press();

TurnOffRadio offCommandR = new TurnOffRadio(radioTree);
onPressed = new DeviceButton(offCommandR);
onPressed.press();

VolumeUpRadio  volUpCommand = new VolumeUpRadio(radioTree);
onPressed = new DeviceButton(volUpCommand);
onPressed.press();
onPressed.press();
onPressed.press();

VolumeDownRadio volumeDownCommandR = new  VolumeDownRadio(radioTree);

onPressed = new DeviceButton(volumeDownCommandR);
onPressed.press();
}

private static TurnOffDevices TurnOffAllDevices(List<ElectronicDevice> allDevices) {
    return null;
}

}



