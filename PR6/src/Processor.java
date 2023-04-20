public class Processor {
    private final int processorFrequency;
    private final int processorCoresCount;
    private final String processorVendor;
    private final int processorWeight;

    public Processor(int processorFrequency, int processorCoresCount, int processorWeight, String processorVendor){
        this.processorFrequency = processorFrequency;
        this.processorCoresCount = processorCoresCount;
        this.processorWeight = processorWeight;
        this.processorVendor = processorVendor;

    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }

    public int getProcessorCoresCount() {
        return processorCoresCount;
    }

    public String getProcessorVendor() {
        return processorVendor;
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

}
