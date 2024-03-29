package model.peripheral.peripherals.mice;

import model.peripheral.peripherals.Mouse;

public class WirelessMouse extends Mouse {
    public WirelessMouse(String connectionToComputer, String brand) {
        super(connectionToComputer, brand);
    }

    public WirelessMouse(String connectionToComputer, String brand, boolean hasScrollWheel) {
        super(connectionToComputer, brand, hasScrollWheel);
    }
}
