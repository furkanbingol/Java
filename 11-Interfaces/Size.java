package OOP.chapter9_interfaces;

import OOP.chapter9_interfaces.InterfaceMultiExtending.AnInterface;

public enum Size implements AnInterface {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    @Override
    public void doThis() {
        System.out.println("in Enum Class");
    }
}

/*
Bir enum, bir interface'i implement edebilir.
Bu durumda aldığı interfacedeki tüm metotlara implement vermelidir!
 */