package main.java.org.launchcode;


public class CD extends BaseDisc {

    public CD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }
}
// TODO: Implement your custom interface.

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.

