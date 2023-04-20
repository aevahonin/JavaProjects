public class Main {

    public static void main(String[] args) {
        Computer Computer1 = new Computer("AMD","Pegasus");
        Computer1.setDisplay(new Display(24,2000,DisplayType.IPS));
        Computer1.setHardDisk(new HardDisk(512,450,HardDiskType.SSD));
        Computer1.setProcessor(new Processor(4500,8,20, "AMD"));
        Computer1.setRAM(new RAM(32,4,"DDR4"));
        Computer1.setKeyboard(new Keyboard("Mechanical",true,1200));
        Computer1.toString();
        System.out.println("Total Weight of All Assembly Components: " + Computer1.getFullWeight() + "\n");

        Computer Computer2 = new Computer("AMD","Valkyrie");
        Computer2.setDisplay(new Display(27,2300,DisplayType.IPS));
        Computer2.setHardDisk(new HardDisk(1024,750,HardDiskType.SSD));
        Computer2.setProcessor(new Processor(4500,16,22,"AMD"));
        Computer2.setRAM(new RAM(32,4,"DDR4"));
        Computer2.setKeyboard(new Keyboard("Mechanical",true,1200));
        Computer2.toString();
        System.out.println("Total Weight of All Assembly Components: " + Computer2.getFullWeight() + "\n");

    }
}
