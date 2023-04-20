public class RAM {
    private final int ramMemorySize;
    private final int ramWeight;
    private final String ramType;

    public RAM(int ramMemorySize, int ramWeight, String ramType) {
        this.ramMemorySize = ramMemorySize;
        this.ramWeight = ramWeight;
        this.ramType = ramType;
    }


    public int getRamMemorySize() {
        return ramMemorySize;
    }

    public int getRamWeight() {
        return ramWeight;
    }

    public String getRamType() {
        return ramType;
    }

}
