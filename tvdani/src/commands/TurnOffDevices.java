package commands;
import devices.ElectronicDevice;
import java.util.List;

public class TurnOffDevices implements Command {

List<ElectronicDevice> allDevices;

public TurnOffDevices(List<ElectronicDevice> newDevices){
allDevices = newDevices;
}

@Override
public void execute() {
for (ElectronicDevice device : allDevices){
    device.off();

}
}

@Override
public void undo() {
for (ElectronicDevice device : allDevices){
    device.on();
}
}


}

