import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количества коробок от пользователя
        int boxes = scanner.nextInt();
        int truck = 0;
        int container = 0;
        int containersCountInTruck = 12;
        int boxesCountInContainer = 27;

        if (boxes == 0 ){
        } else if (boxes < boxesCountInContainer) {
            truck++;
            container++;
            System.out.println("Грузовик: " + truck + "\n\tКонтейнер: " + container);
        } else{
            truck++;
            container++;
            System.out.println("Грузовик: " + truck + "\n\tКонтейнер: " + container);
        }
        for (int x = 1; x <= boxes; x++){
            System.out.println("\t\tЯщик: " + x);
            if (x % (boxesCountInContainer * containersCountInTruck) == 0){
                truck++;
                System.out.println("Грузовик: " + truck);
            }
            if (x % boxesCountInContainer == 0){
                if( x != boxes) {
                    container++;
                    System.out.println("\tКонтейнер: " + container);
                }
            }
        }
        System.out.println("Необходимо:" );
        System.out.println("грузовиков - " + truck + " шт.");
        System.out.println("контейнеров - " + container + " шт.");
    }
}

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */


/**/





