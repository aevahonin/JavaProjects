

public class Dimensions {

    private final  int width;
    private final int height;
    private final int length;
    private int volume;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(width,height,length);
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(width,height,length);
    }

    public Dimensions setLength(int length) {
        return new Dimensions(width,height,length);
    }

    public int getVolume() {
        volume = width * height * length;
        return volume;
    }
    public String dimensionsInfo(){
        return "Габариты товара: " + "\n" +
                "Длина: " + getLength() + ";" + "\n" +
                "Высота: " + getHeight() + ";" + "\n" +
                "Ширина: " + getWidth() + ";" + "\n" +
                "Обьём: " + getVolume() + ";";

    }
}
