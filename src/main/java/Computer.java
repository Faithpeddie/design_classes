public class Computer {

    //properties

    private int storageSpace;
    private String printerModel;


    //constructor

    public Computer (int storageSpace) {
        this.storageSpace = storageSpace;
        this.printerModel = "None";
    }

    //behaviour (first method)
    public void moreStorage(int addStorage){
        this.storageSpace += addStorage;
    }
    
    //behaviour (second method)
    public void printMessage(){
        if (printerModel.equals("None")){
            System.out.println("No printer connected.");
        } else {
            System.out.println("Hello World!");
        }
    }

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
