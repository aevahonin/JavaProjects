
public class Main {

    public static void main(String[] args) {
        Cargo cargo = new Cargo(123,"Minsk", false,false);
        System.out.println(cargo.info());
        Dimensions dimensions = new Dimensions(12,4,10);
        System.out.println(dimensions.dimensionsInfo());

        Cargo copyCargo = new Cargo(123455666,"Grodno");
        System.out.println(copyCargo.info());
        Dimensions copyDimensions = new Dimensions(3,5,10);
        System.out.println(copyDimensions.dimensionsInfo());

    }
}
