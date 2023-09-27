package main.java.org.launchcode;

public class DVD extends BaseDisc {

    public DVD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}