public class Computer {
    private String vendor = "";
    private String name = "";
    public int fullWeight = 0;
    private Processor processor;
    private HardDisk hardDisk;
    private Display display;
    private Keyboard keyboard;
    private RAM ram;


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String toString(){
        System.out.println(
                "INFO: " + "\n" +
                "Vendor: " + getVendor() + "\n" +
                "Name: " + getName() + "\n" +
                "Processor Data: " + "\n" +
                "Frequency: " + processor.getProcessorFrequency() + "MHz" +"\n" +
                "Number of Cores: " + processor.getProcessorCoresCount() + "\n" +
                "Weight: " + processor.getProcessorWeight() + "\n" +
                "Processor Manufacturer: " + processor.getProcessorVendor() +"\n");
        System.out.println(
                "Hard Disk Information: " + "\n" +
                "Capacity: " + hardDisk.getDiskMemoryVolume() + "\n" +
                "Weight: " + hardDisk.getDiskWeight() + "\n" +
                "Type: " + hardDisk.getDiskType() +"\n");
        System.out.println(
                "Display Information: " + "\n" +
                "Diagonal: " + display.getDisplayDiagonal() + "\n" +
                "Weight: " + display.getDisplayWeight() + "\n" +
                "Type: " + display.getMatrixType() + "\n");
        System.out.println(
                "RAM Data: " + "\n" +
                "Memory Size: " + ram.getRamMemorySize() + "\n" +
                "Type: " + ram.getRamType() + "\n" +
                "Weight: " + ram.getRamWeight() +"\n");
        System.out.println(
                "Keyboard Data: " + "\n" +
                "Type: " + keyboard.getKeyboardType() + "\n" +
                "Led: " + keyboard.isKeyboardLed() + "\n" +
                "Weight: " + keyboard.getKeyboardWeight() +"\n");
        return null;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public void setRAM(RAM ram) {
        this.ram = ram;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int getFullWeight(){
        fullWeight = ram.getRamWeight() + processor.getProcessorWeight() + hardDisk.getDiskWeight() + display.getDisplayWeight() + keyboard.getKeyboardWeight();
        return fullWeight;
    }

    public Processor getProcessor(){

        return processor;
    }
    public HardDisk getHardDisk(){

        return hardDisk;
    }
    public Display getDisplay() {

        return display;
    }
    public RAM getRam(){
        return ram;
    }
    public Keyboard getKeyboard(){

        return keyboard;
    }
    public String getVendor() {

        return vendor;
    }
    public String getName() {

        return name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setName(String name) {
        this.name = name;
    }
}


