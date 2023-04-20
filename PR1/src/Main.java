public class Main {

    public static void main(String[] args) {
        Basket tolyaBasket = new Basket();
        tolyaBasket.add("Молоко", 150,5,1000);
        tolyaBasket.add("Яйцо", 100,2,230);
        tolyaBasket.add("Конфеты",20,30,2);
        tolyaBasket.print("");

        System.out.println("\n" + "Итого: " + tolyaBasket.getTotalPrice() + "руб.| " + tolyaBasket.getTotalWeight() +  " гр.| ");
    }
}
