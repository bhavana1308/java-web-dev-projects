package main.java.org.launchcode;


public abstract class BaseDisc implements OpticalDisc {

    private String name;
    private int capacity;
    private String contents;

    public BaseDisc(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning the disc...");
    }

    @Override
    public void storeData(String data) {
        this.contents = data;
    }

    @Override
    public String readData() {
        return contents;
    }

    @Override
    public void reportInformation() {
        System.out.println("Disc Name: " + name);
        System.out.println("Capacity: " + capacity + " MB");
        System.out.println("Contents: " + contents);
    }
}






