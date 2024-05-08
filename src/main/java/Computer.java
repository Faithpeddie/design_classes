public class Computer {

    //properties

    private int storageSpace;
    private String printerModel;


    //constructor

    public Computer (int storageSpace) {
        this.storageSpace = storageSpace;
        this.printerModel = "Zero";
    }

    //behaviour (first method)
    public void moreStorage(int addStorage){
        this.storageSpace += addStorage;
    }
    
    //behaviour (first method)


    //getter
    public int getStorageSpace() {
        return this.storageSpace;
    }

    //setter
    public void printerProperty(String addPrinter) {
        this.printerModel = addPrinter;
    }

    //getter
    public String getPrinterModel() {
        return this.printerModel;
    }

}
