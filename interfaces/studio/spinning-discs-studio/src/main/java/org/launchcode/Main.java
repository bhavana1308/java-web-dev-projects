package main.java.org.launchcode;

public class Main {

    public static void main(String[] args) {

        CD myCd = new CD("Music CD", 700);
        DVD myDvd = new DVD("Movie DVD", 4700);

        myCd.spinDisc();
        myCd.storeData("Sample music data");
        System.out.println("CD Data: " + myCd.readData());
        myCd.reportInformation();

        System.out.println();

        myDvd.spinDisc();
        myDvd.storeData("Sample movie data");
        System.out.println("DVD Data: " + myDvd.readData());
        myDvd.reportInformation();
    }
}

// TODO: Declare and initialize a CD and a DVD object.

// TODO: Call each CD and DVD method to verify that they work as expected.

