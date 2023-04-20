
public class Cargo {

    private final int weight;
    private final String deliveryAddress;
    private boolean isPossibleToTurn;
    private boolean isFragile;
    private final String registrationNumber = "1483924329842by";

    public Cargo(int weight, String deliveryAddress,boolean isPossibleToTurn1, boolean isFragile1) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isPossibleToTurn = isPossibleToTurn1;
        this.isFragile = isFragile1;
    }

    public Cargo(int weight, String deliveryAddress) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public boolean isPossibleToTurn() {
        return isPossibleToTurn;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public Cargo setWeight(int weight) {
        return new Cargo(weight,deliveryAddress, isPossibleToTurn, isFragile);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(weight,deliveryAddress, isPossibleToTurn, isFragile);
    }
    public String info(){
        return "Информация о товаре : " + " \n " + "Масса = " + getWeight()+ " гр; " +  " \n " +
                "Адрес доставки:  " + getDeliveryAddress() + ":" +  " \n " +
                "Можно ли поворачивать:  " + isPossibleToTurn() + ";" + " \n " +
                "Хрупкий: " + isFragile() + ";" + "\n" +
                "Регистрационный номер: " + registrationNumber;
    }

}

