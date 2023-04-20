public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int a, int b) {
        minFloor = a;
        maxFloor = b;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        currentFloor = currentFloor - 1;
        return currentFloor;
    }

    public int moveUp() {
        currentFloor = currentFloor + 1;
        return currentFloor;
    }

    public void move(int floor) {
        if (minFloor > floor || maxFloor < floor ) {
            System.out.println("Введённый этаж не верный");
        }

        while (currentFloor > floor && floor > minFloor) {
            moveDown();
            System.out.println(getCurrentFloor());
        }

        while (currentFloor < floor && floor < maxFloor) {
            moveUp();
            System.out.println(getCurrentFloor());
        }
    }
}
