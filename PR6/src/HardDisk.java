public class HardDisk {
    private final int diskMemoryVolume;
    private final int diskWeight;
    private final HardDiskType diskType;

    public HardDisk(int diskMemoryVolume, int diskWeight, HardDiskType diskType){
        this.diskMemoryVolume = diskMemoryVolume;
        this.diskWeight = diskWeight;
        this.diskType = diskType;
    }

    public int getDiskMemoryVolume() {
        return diskMemoryVolume;
    }

    public int getDiskWeight() {
        return diskWeight;
    }

    public HardDiskType getDiskType() {
        return diskType;
    }

}
