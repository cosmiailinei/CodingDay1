package model.peripheral.peripherals;

import model.peripheral.Peripheral;

public class Mouse extends Peripheral {
    private boolean hasScrollWheel;//camp/variabila(accesor,tip de date, denumire)

    public Mouse(String connectionToComputer, String brand) {
        super(connectionToComputer, brand);
        this.hasScrollWheel=false;
    }

    public Mouse(String connectionToComputer, String brand, boolean hasScrollWheel) {
        super(connectionToComputer, brand);
        this.hasScrollWheel = hasScrollWheel;
        //este metoda
    }


    public boolean isHasScrollWheel(){
        return hasScrollWheel;
    }


}
